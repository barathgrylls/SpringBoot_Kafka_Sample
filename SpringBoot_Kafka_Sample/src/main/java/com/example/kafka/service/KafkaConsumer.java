package com.example.kafka.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

	@Value("${spring.kafka.topics}")
	private String topic;
	
	@KafkaListener(topics="${spring.kafka.topics}",groupId="${spring.kafka.consumer.group-id}")
	public void consumeFromTopic(String message) {
		System.out.println("inside consumeFromTopic");
		System.out.println("Message from topic"+message);
	}
}
