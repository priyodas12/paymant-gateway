package io.microservicelab.paymantgateway.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment-gateway")
public class GenericController {

    @Value("${spring.application.name}")
    String applicationName;

    @GetMapping("/ping")
    public String pingGatewayService(){
        return "200 OK from "+applicationName;
    }
}
