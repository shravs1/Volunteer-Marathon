package com.cognizant.controllers;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.volunteer.vo.EventsVo;

@RestController
public class VolunteeringController {
	 private static final Logger LOGGER = LogManager.getLogger(VolunteeringController.class);

	@RequestMapping("/greeting")
    public EventsVo getEvents(@RequestParam(value="name", defaultValue="World") String name) {
		LOGGER.debug("Called VolunteeringController.getEvents() methods");
		
		LOGGER.debug("Leaving VolunteeringController.getEvents() methods");
        return new EventsVo();
    }
}
