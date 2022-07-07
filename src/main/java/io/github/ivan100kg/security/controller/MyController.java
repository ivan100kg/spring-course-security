package io.github.ivan100kg.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {

    @GetMapping("/")
    public String getInfoForAllEmps() {
        return "all-employees";
    }

    @GetMapping("/hr-info")
    public String getInfoOnlyForHR() {
        return "view-for-hr";
    }

    @GetMapping("/manager-info")
    public String getInfoOnlyForManager() {
        return "view-for-manager";
    }

}
