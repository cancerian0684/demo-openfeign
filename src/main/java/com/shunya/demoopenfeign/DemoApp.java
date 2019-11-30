package com.shunya.demoopenfeign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class DemoApp implements ApplicationRunner {

	@Autowired
	private SampleClient sampleClient;

	public static void main(String[] args) {
		SpringApplication.run(DemoApp.class, args);
	}

	@Override
	public void run(ApplicationArguments args) {
		final ServiceResponse user = sampleClient.getUser();
		System.out.println("user = " + user);
	}
}
