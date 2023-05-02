package shop.mtcoding.admin_chart_sample.connection_data;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import shop.mtcoding.admin_chart_sample.connection_data.dto.ConnectionDataOutDTO;
import shop.mtcoding.admin_chart_sample.connection_data.repository.ConnectionDataRepository;

@RequiredArgsConstructor
@Service
public class AdminStatisticsService {

    private final ConnectionDataRepository connectionDataRepository;

    public ConnectionDataOutDTO getConnectionData() {

        // 현재 로직에서 로그인시 cnt ++ 하는 쿼리 추가하면 됨

        List<String> recentMonthsForCalcul = new ArrayList<>();
        List<String> recentMonths = new ArrayList<>();
        int currentYear = LocalDate.now().getYear();
        int currentMonth = LocalDate.now().getMonthValue();

        // recentMonths : 오늘기준 현재 월을 제외한 최근 6개월 month들을 그래프의 x축에 표현 (ex. 11, 12, 1, 2,
        // 3, 4)
        // recentMonthsForCalcul : 202211, 202212, 202301로 저장되어 DB cnt 접속횟수 inquery에 활용
        // (DB Query에서 concat 문자열을 활용하므로 String으로 저장)
        for (int i = 1; i < 7; i++) {
            int month = currentMonth - i;
            int year = currentYear;
            if (month <= 0) {
                month += 12;
                year--;
            }
            recentMonths.add(String.valueOf(month));
            recentMonthsForCalcul.add(String.valueOf(year * 100 + month));
        }

        Collections.reverse(recentMonths);
        List<Integer> connectionPlayerDataListPS = connectionDataRepository.findByRoleAndYearMonthIn("Player",
                recentMonthsForCalcul);
        List<Integer> connectionCompanyDataListPS = connectionDataRepository.findByRoleAndYearMonthIn("Company",
                recentMonthsForCalcul);

        return new ConnectionDataOutDTO(connectionPlayerDataListPS, connectionCompanyDataListPS, recentMonths);
    }
}
