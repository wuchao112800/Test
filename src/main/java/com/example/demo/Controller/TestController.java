package com.example.demo.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/test")
    public String findDemoById(){
        System.out.println("--新增 dev 分支 ---");
        return  "success";
    }
}
