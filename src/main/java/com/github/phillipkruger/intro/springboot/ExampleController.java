package com.github.phillipkruger.intro.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController {

    @Autowired
    private HostInfoService hostInfoService;
    
    @RequestMapping("/hello")
    public String hello() {
        return "hello (" + hostInfoService.getHostName() + ")";
    }

}
