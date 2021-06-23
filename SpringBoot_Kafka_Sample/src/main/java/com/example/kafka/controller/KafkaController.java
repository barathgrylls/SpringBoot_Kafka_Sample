package com.example.kafka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.kafka.service.KafkaProducer;



@RestController
public class KafkaController {
	
	
	@Autowired
	private KafkaProducer kafkaPublish;
	
	@GetMapping(value = "/test")
	public String test() {
	return "test success";
	}	
	
	@GetMapping(value = "${spring.kafka.publish.url}")
	public void publishToTopic(@RequestParam("msg") String msg) {
		kafkaPublish.publishToTopic(msg);
	}

}
