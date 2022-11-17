package com.endava.devweek.publisher.event;

public enum Event {
	
	COMPLETED("completed"), REFUSED("refused");
	
	private String eventName;

	private Event(String eventName) {
		this.setEventName(eventName);
	}

	public String getEventName() {
		return eventName;
	}

	private void setEventName(String eventName) {
		this.eventName = eventName;
	}
	
	

}
