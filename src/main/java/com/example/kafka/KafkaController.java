package com.example.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaController {

	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;
	
	@PostMapping(value = "/publishKafkaData")
	public void publish(@RequestBody MessageRequest msg) {
		kafkaTemplate.send("SowmyaKafkaTopic",msg.getMessage());
	}
}
