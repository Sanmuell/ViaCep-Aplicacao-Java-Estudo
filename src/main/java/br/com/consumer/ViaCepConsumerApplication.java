package br.com.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ViaCepConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ViaCepConsumerApplication.class, args);
	}

}
