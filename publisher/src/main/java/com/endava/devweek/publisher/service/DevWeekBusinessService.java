package com.endava.devweek.publisher.service;

import org.springframework.stereotype.Service;

import com.endava.devweek.publisher.event.Event;
import com.endava.devweek.publisher.event.manager.EventManager;

@Service
public class DevWeekBusinessService {

	private EventManager eventManager;

	public DevWeekBusinessService(EventManager eventManager) {
		super();
		this.eventManager = eventManager;
	}

	public void performSomeAction(String actionMessage) {
		performeSomeBusinessAction();
		publishEvent(actionMessage);
		
		
	}

	private void performeSomeBusinessAction() {
		// TODO Auto-generated method stub
	}

	private void publishEvent(String actionMessage) {
		Event event = null;
		if(actionMessage.contains(Event.REFUSED.getEventName())) {
			event = Event.REFUSED;
		}else {
			event = Event.COMPLETED;
		}
		
		eventManager.publishEvent(actionMessage, event);
	}

}
