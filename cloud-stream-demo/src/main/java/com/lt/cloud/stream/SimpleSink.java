package com.lt.cloud.stream;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

@EnableBinding(Sink.class)
public class SimpleSink {
	@StreamListener(Sink.INPUT)
	public void process(String messsage) {
		System.out.println(messsage);
	}
}
