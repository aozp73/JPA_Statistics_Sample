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

        ConnectionDataOutDTO connectionDataOutDTO = adminStatisticsService.getConnectionData();

        return ResponseEntity.ok().body(new ResponseDto<>().data(connectionDataOutDTO));
    }

}
