package com.lt.cloud.stream;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.context.annotation.Bean;
import org.springframework.integration.annotation.InboundChannelAdapter;
import org.springframework.integration.core.MessageSource;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.transaction.support.ResourceTransactionManager;


//@EnableBinding(Source.class)
public class SimpleSource {
	private SimpleDateFormat simpleDateFormat=
			new SimpleDateFormat("HH:mm:ss");
	
	@Bean
	@InboundChannelAdapter(channel=Source.OUTPUT)//@InboundChannelAdapter默认每隔一秒执行一次
	public MessageSource<String> simpletext(){
		return ()-> MessageBuilder.withPayload("Hello at "+simpleDateFormat.format(new Date())).build();
	}
}
