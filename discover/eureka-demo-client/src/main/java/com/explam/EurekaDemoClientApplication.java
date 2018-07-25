package com.explam;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class EurekaDemoClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaDemoClientApplication.class, args);
    }
    @Value("${server.port}")
    private int port;


    @RequestMapping("/hi")
    public String hi() {
        return "hi, my port=" + port;
    }
}
