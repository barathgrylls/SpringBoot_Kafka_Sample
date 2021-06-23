package com.example.kafka.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.kafka.KafkaAutoConfiguration;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducer {

	
	
	@Value("${spring.kafka.topics}")
	 private String topics;
	
	@Autowired
	private KafkaTemplate<String, String> kafkaTemp;
	
	public void publishToTopic(String message) {
		
		kafkaTemp.send(topics,message);
	}
}
