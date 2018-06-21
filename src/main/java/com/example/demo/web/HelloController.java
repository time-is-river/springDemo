package com.example.demo.web;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {
    @RequestMapping("/")
    public String index(){
        return "welcome";
    }
    @RequestMapping("/hello")
    public String hello(){
        return "springBootTest";
    }
    @GetMapping("/WIN_10_UP")
    public String test2(@RequestParam String showStr) {

        return showStr;
    }
    @PostMapping("/postRequest")
    public String requestTest() {


        return  "";
    }
}
