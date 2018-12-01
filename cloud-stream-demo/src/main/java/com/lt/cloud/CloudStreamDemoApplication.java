package com.lt.cloud;

import java.text.SimpleDateFormat;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.context.annotation.Bean;
import org.springframework.integration.annotation.InboundChannelAdapter;
import org.springframework.integration.core.MessageSource;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.MessageChannel;

@SpringBootApplication

public class CloudStreamDemoApplication {


	public static void main(String[] args) {
		SpringApplication.run(CloudStreamDemoApplication.class, args);
	}
	
	@Bean
	CommandLineRunner sourceSender(MessageChannel input) {
		return args ->{
			input
			.send(MessageBuilder.withPayload(" hello world")
					.build());
			
			
		};
	}
}
