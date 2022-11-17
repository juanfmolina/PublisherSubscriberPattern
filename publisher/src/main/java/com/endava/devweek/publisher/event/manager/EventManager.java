package com.endava.devweek.publisher.event.manager;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;

import com.endava.devweek.publisher.event.Event;

@Component
public class EventManager {
	
	public final static String ROUTINGKEY_EVENT_PREFIX = "endava.devweek.event.";
	
	public final static String EXCHANGE = "endava.devweek.event";
	private RabbitTemplate rabbitTemplate;
	
	
	public EventManager(RabbitTemplate rabbitTemplate) {
		super();
		this.rabbitTemplate = rabbitTemplate;
	}

	public void publishEvent(String message, Event event) {
		rabbitTemplate.convertAndSend(EXCHANGE, ROUTINGKEY_EVENT_PREFIX + event.getEventName(), message);
	}

}
