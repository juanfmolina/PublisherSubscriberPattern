package com.endava.devweek.publisher.ws;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.endava.devweek.publisher.service.DevWeekBusinessService;

@RestController
public class DevWeekWebService {
	
	private DevWeekBusinessService businessService;

	public DevWeekWebService(DevWeekBusinessService businessService) {
		this.businessService = businessService;
	}
	
	@PostMapping("/action")
	@ResponseStatus(value = HttpStatus.NO_CONTENT)
	public void perfomeAction(@RequestBody String message) {
		businessService.performSomeAction(message);
	}
	
	

}
