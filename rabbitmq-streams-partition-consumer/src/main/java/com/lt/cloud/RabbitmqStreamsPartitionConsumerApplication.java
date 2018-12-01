package com.lt.cloud;

import org.springframework.amqp.support.AmqpHeaders;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.messaging.handler.annotation.Payload;

@SpringBootApplication
@EnableBinding(Sink.class)
public class RabbitmqStreamsPartitionConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(RabbitmqStreamsPartitionConsumerApplication.class, args);
	}
	@StreamListener(Sink.INPUT)
	public void listen(@Payload String in,@Header(AmqpHeaders.CONSUMER_QUEUE) String queue) {
		System.out.println(in+"  received from queue:"+queue);
	}
}
