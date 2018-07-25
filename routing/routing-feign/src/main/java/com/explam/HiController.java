package com.explam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {
    @Autowired
    private CallHiService callHiService;

    @RequestMapping(value = "hi")
    public String hi(@RequestParam String h){
        return callHiService.sayHiFromClientOne(h);
    }

}
