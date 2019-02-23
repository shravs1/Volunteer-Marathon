package com.cognizant.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.common.vo.UserVo;
import com.cognizant.event.service.EventService;
import com.cognizant.event.vo.EventRequestVo;
import com.cognizant.event.vo.EventResponseVo;

@RestController
public class EventController {
	 private static final Logger LOGGER = LogManager.getLogger(EventController.class);
	 
	@Autowired
	EventService eventService;
	
	@Autowired
	HttpServletRequest request;
	 
	@RequestMapping(consumes="application/json",path="/events")
    public List<EventResponseVo> events(@RequestBody EventRequestVo requestVo) throws Exception {
		LOGGER.debug("Called VolunteeringController.getEvents() methods");
		List<EventResponseVo> responseVo = null;
		UserVo user = new UserVo();
		user.setUserName(request.getHeader("username"));
		user.setPassword(request.getHeader("password"));
		requestVo.setUser(user);
		responseVo = eventService.event(requestVo);
		LOGGER.debug("Leaving VolunteeringController.getEvents() methods");
        return responseVo;
    }
}
