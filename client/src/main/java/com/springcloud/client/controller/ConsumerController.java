package com.springcloud.client.controller;

import com.springcloud.client.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {
    @Autowired
    private HelloService helloService;

    @RequestMapping("/ribbon-consumer")
    public String helloConsumer() {
        return helloService.helloService();
    }
}
