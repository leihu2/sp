package com.explam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableDiscoveryClient
@EnableFeignClients
public class ZipkinClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZipkinClientApplication.class, args);
    }
    @Autowired
    private FeignServiceInterface feignServiceInterface;
    @RequestMapping(value = "/")
    public String home(){
        return feignServiceInterface.callServiceFeign("lei");
    }
    @FeignClient(value = "zipkin-client0")
    public interface FeignServiceInterface{
        @RequestMapping(value = "/",method = RequestMethod.GET)
        String callServiceFeign(@RequestParam(value = "name") String name);
    }
}
