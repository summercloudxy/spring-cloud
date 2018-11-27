package com.springcloud.servicea.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Random;

@RestController
public class ServiceAController {
    @Autowired
    private DiscoveryClient discoveryClient;
    public static final Logger logger = LoggerFactory.getLogger(ServiceAController.class);

    @GetMapping("/hello")
    public String hello() throws InterruptedException {
        int order = discoveryClient.getOrder();
        List<String> services = discoveryClient.getServices();
        for (String service : services) {
            List<ServiceInstance> instances = discoveryClient.getInstances(service);
        }
        String description = discoveryClient.description();
        //断路器默认2000超时触发
        int sleepTime = 2000+new Random().nextInt(3000);
        System.out.println("sleeptime = " + sleepTime);
        Thread.sleep(sleepTime);
        logger.info(description);
        return "Hello world";
    }
}
