package com.endava.devweek.subscriber.subscriber;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Controller;



@Controller
public class DevWeekSubscriber {
	
	Logger logger = LoggerFactory.getLogger(DevWeekSubscriber.class);
	
	
	@RabbitListener(queues = "endava.devweek.email.pending")
	public void receiveMessage(String message) {
		logger.info(message + " from Email");
	}
	
	@RabbitListener(queues = "endava.devweek.facilities.order.pending")
	public void receiveMessageToFacilities(String message) {
		logger.info(message + " from Facilities");
	}


}
