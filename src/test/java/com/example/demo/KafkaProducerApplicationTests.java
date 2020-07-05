package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.ServerProperties.Jetty.Threads;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.service.KafkaProducerService;

@SpringBootTest
class KafkaProducerApplicationTests {
	
	@Autowired
	private KafkaProducerService producerService;

	@Test
	public void send() throws Exception {
		String topic="topic02";
		for (int i = 0; i < 800; i++) {
			producerService.sendMessage(topic, "hello kafka "+i);
			Thread.sleep(50);
		}
		
//		try {
//			Thread.sleep(Integer.MAX_VALUE);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}

}
