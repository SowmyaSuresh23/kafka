package com.example.kafka;
import org.springframework.stereotype.Component;

@Component
public class KafkaListener {

	@org.springframework.kafka.annotation.KafkaListener(topics = "SowmyaKafkaTopic", groupId = "test")
	void listener(String data) {
		System.out.println("Data Recieved: " + data);
	}
}

