package com.example.cw1.controller;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RestController;
// import com.example.cw1.model.AppConfig;
// @RestController
// public class ApiController {
//     private final AppConfig ac;
//     public ApiController(AppConfig ac){
//         this.ac=ac;
//     }
//     @GetMapping("/info")
//     public String info(){
//         return "App Name:"+ac.getAppName()+",Version:"+ac.getAppVersion();
//     }
// }

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.cw1.model.AppConfig;

@RestController
public class ApiController{
    private final AppConfig ac;
    public ApiController(AppConfig ac){
        this.ac=ac;
    }
    @GetMapping("/info")
    public String info(){
        return "App Name:"+ac.getAppName()+",Version:"+ac.getAppVersion();
    }
}