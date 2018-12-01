package com.lt.cloud.stream;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Processor;
import org.springframework.messaging.handler.annotation.SendTo;

//@EnableBinding(Processor.class)//@EnableBinding: This annotation will enable this class as a Spring Cloud Stream application
public class SimpleProcessor {
	//@StreamListener:It will listen for new incoming messages in the Processor.INPUT channel
	@StreamListener(Processor.INPUT)//Processor it creates the input channel 
	//@SendTo:It will send a message to the Processor.OUTPUT channel
	@SendTo(Processor.OUTPUT)
	public String transformToUpperCase(String message) {
		System.out.println(message);
		return message.toUpperCase();
	}
}
