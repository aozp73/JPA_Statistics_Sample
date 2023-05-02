package shop.mtcoding.admin_chart_sample.connection_data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.RequiredArgsConstructor;
import shop.mtcoding.admin_chart_sample.connection_data.dto.ConnectionDataOutDTO;
import shop.mtcoding.admin_chart_sample.core.dto.ResponseDto;

@RequiredArgsConstructor
@RequestMapping("admin")
@Controller
public class AdminConnectionController {

    private final AdminConnectionService adminStatisticsService;

    @GetMapping("/main")
    public String main() {

        return "admin/main";
    }

    @GetMapping("/statistics/connection")
    public String connection() {

        return "admin/connection";
    }

    @GetMapping("/statistics/reservation")
    public String reservation() {

        return "admin/reservation";
    }

    @GetMapping("/statistics/connection/data")
    public ResponseEntity<?> getData() {
        System.out.println("테스트 : 통신성공");
        // List<Integer> playerConnectionData = new ArrayList<>(Arrays.asList(19, 25,
        // 20, 31, 26, 35));
        // List<Integer> compnayConnectionData = new ArrayList<>(Arrays.asList(14, 12,
        // 16, 18, 24, 25));
        // List<String> recentHalfYear = new ArrayList<>(Arrays.asList("11", "12", "1",
        // "2", "3", "4"));

        // ConnectionDataOutDTO connectionDataOutDTO = new
        // ConnectionDataOutDTO(playerConnectionData,
        // compnayConnectionData, recentHalfYear);

        ConnectionDataOutDTO connectionDataOutDTO = adminStatisticsService.getConnectionData();

        return ResponseEntity.ok().body(new ResponseDto<>().data(connectionDataOutDTO));
    }

}
