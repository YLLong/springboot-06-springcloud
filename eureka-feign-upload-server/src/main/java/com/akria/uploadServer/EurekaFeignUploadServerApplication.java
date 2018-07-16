package com.akria.uploadServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication
public class EurekaFeignUploadServerApplication {

	@RestController
	public class UploadController {

		@PostMapping(value = "/uploadFile", produces = {MediaType.APPLICATION_JSON_UTF8_VALUE}, consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
		public String handleFileUpload(@RequestPart(value = "file") MultipartFile file) {
			System.out.println(file.getName());
			return file.getName();
		}

	}

	public static void main(String[] args) {
		SpringApplication.run(EurekaFeignUploadServerApplication.class, args);
	}
}
