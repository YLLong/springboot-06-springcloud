package com.akria.uploadClient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication
public class EurekaFeignUploadClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaFeignUploadClientApplication.class, args);
	}

}
