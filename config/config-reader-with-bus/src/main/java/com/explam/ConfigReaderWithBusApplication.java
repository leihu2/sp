package com.explam;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
@RefreshScope
public class ConfigReaderWithBusApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConfigReaderWithBusApplication.class, args);
    }
    @Value("${message}")
    String value;
@RequestMapping("/")
public String home(){
    return value;
}
}
