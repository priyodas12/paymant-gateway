package io.microservicelab.paymantgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class PaymantGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(PaymantGatewayApplication.class, args);
	}

}
