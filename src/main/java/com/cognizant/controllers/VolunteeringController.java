package com.cognizant.controllers;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.event.service.EventService;
import com.cognizant.event.vo.EventRequestVo;
import com.cognizant.event.vo.EventResponseVo;

@RestController
public class VolunteeringController {
	 private static final Logger LOGGER = LogManager.getLogger(VolunteeringController.class);
	 
	@Autowired
	EventService eventService;
	 
	@RequestMapping(consumes="application/json",path="/events")
    public List<EventResponseVo> events(@RequestBody EventRequestVo requestVo) throws Exception {
		LOGGER.debug("Called VolunteeringController.getEvents() methods");
		List<EventResponseVo> responseVo = null;
		responseVo = eventService.event(requestVo);
		LOGGER.debug("Leaving VolunteeringController.getEvents() methods");
        return responseVo;
    }
}
