package com.explam;

import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableDiscoveryClient
@RestController
public class HelloJava {
    @RequestMapping("hello")
    String home(){
        return "no name";
    }

}
