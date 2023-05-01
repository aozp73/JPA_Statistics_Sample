package shop.mtcoding.admin_chart_sample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
public class AdminController {

    @GetMapping("/admin/main")
    public String main() {

        return "admin/main";
    }

    @GetMapping("/admin/statistics/connection")
    public String connection() {

        return "admin/connection";
    }

    @GetMapping("/admin/statistics/views")
    public String views() {

        return "admin/views";
    }

    @GetMapping("/admin/statistics/reservation")
    public String reservation() {

        return "admin/reservation";
    }

}
