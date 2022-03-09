package com.example.kafka_consumer.cofiguration.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.example.kafka_consumer.model.User;

@Service
public class KafkaConsumer {

	

	@KafkaListener(topics = "Kafka_Example", groupId = "group_id")
	public void consume(String message) {
		System.out.println("consumed message: "+ message);
	}
	
	@KafkaListener(topics = "Kafka_Example_Json", groupId = "group_json",
			containerFactory = "userKafkaListenerContainerFactory")
	public void consumeJson(User user) {
		System.out.println("consumed user json msg: "+ user);
	}
}


