package shop.mtcoding.admin_chart_sample.view_data;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import shop.mtcoding.admin_chart_sample.view_data.dto.ViewDataOutDTO;
import shop.mtcoding.admin_chart_sample.view_data.entity.Stadium;
import shop.mtcoding.admin_chart_sample.view_data.entity.ViewData;
import shop.mtcoding.admin_chart_sample.view_data.repository.ViewDataRepository;

@Service
@RequiredArgsConstructor
public class AdminViewService {

    private final ViewDataRepository viewDataRepository;

    public ViewDataOutDTO getViewsData(Integer check) {
        // 1. 오늘 날짜에서 1달 전의 년/월 값을 구합니다.
        LocalDate now = LocalDate.now();
        System.out.println("테스트 now : " + now.toString());
        LocalDate oneMonthAgo = now.minusMonths(check);
        System.out.println("테스트 oneMonthAgo : " + oneMonthAgo.toString());
        Integer year = oneMonthAgo.getYear();
        Integer month = oneMonthAgo.getMonthValue();

        System.out.println("테스트 month : " + month);

        // 2. 해당 년/월 값을 이용하여 ViewData 테이블에서 해당 월의 데이터를 조회합니다.
        List<ViewData> viewDataList = viewDataRepository.findByYearAndMonth(year, month);

        System.out.println("테스트 ==================================================");
        for (ViewData viewData : viewDataList) {
            System.out.println("테스트 viewData.getCnt() : " + viewData.getCnt());
        }
        System.out.println("테스트 ==================================================");

        // 3. 조회된 데이터를 경기장 별로 묶어서 해당 경기장의 총 접속수를 계산합니다.
        Map<Stadium, Long> stadiumMap = viewDataList.stream()
                .collect(Collectors.groupingBy(ViewData::getStadium, Collectors.summingLong(ViewData::getCnt)));

        // 4. 계산된 접속수를 기준으로 내림차순 정렬하여 상위 10개의 경기장을 선택합니다.
        List<Map.Entry<Stadium, Long>> sortedList = new ArrayList<>(stadiumMap.entrySet());
        Collections.sort(sortedList, (e1, e2) -> Long.compare(e2.getValue(), e1.getValue()));
        List<Map.Entry<Stadium, Long>> topEntries = sortedList.subList(0, Math.min(sortedList.size(), 10));

        // 5. 선택된 10개의 경기장 정보를 담은 Stadium 객체 리스트와 접속수를 담은 Long 타입 리스트를 반환합니다.
        List<Stadium> topStadiumsPS = topEntries.stream().map(Map.Entry::getKey).collect(Collectors.toList());
        List<String> topStadiumNames = topStadiumsPS.stream().map(Stadium::getName).collect(Collectors.toList());
        List<Long> viewCounts = topEntries.stream().map(Map.Entry::getValue).collect(Collectors.toList());
        Collections.reverse(viewCounts);
        Collections.reverse(topStadiumNames);

        // for (Stadium st : topStadiums) {
        // System.out.println("테스트 1 : " + st.getName());
        // }
        // System.out.println("테스트 2 : " + viewCounts);

        System.out.println("테스트 : 2222222222" + check);
        if (check == 1) {
            return new ViewDataOutDTO(topStadiumNames, viewCounts, month, check, false, true);
        } else if (check == 6) {
            return new ViewDataOutDTO(topStadiumNames, viewCounts, month, check, true, false);
        } else {
            return new ViewDataOutDTO(topStadiumNames, viewCounts, month, check, false, false);

        }

    }

}
