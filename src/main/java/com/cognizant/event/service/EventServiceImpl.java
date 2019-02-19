package com.cognizant.event.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.common.vo.StatusVo;
import com.cognizant.enumeration.ActionType;
import com.cognizant.enumeration.StatusType;
import com.cognizant.event.bo.EventBo;
import com.cognizant.event.repository.EventRepository;
import com.cognizant.event.vo.EventRequestVo;
import com.cognizant.event.vo.EventResponseVo;

@Service
public class EventServiceImpl implements EventService {

	private static final Logger LOGGER = LogManager.getLogger(EventServiceImpl.class);

	@Autowired
	EventRepository repository;

	public List<EventResponseVo> event(EventRequestVo requestVo) throws Exception {
		List<EventResponseVo> response = new ArrayList<EventResponseVo>();
		StatusVo status = null;
		EventResponseVo responseVo = new EventResponseVo(requestVo);
		EventBo eventBo = new EventBo(requestVo.getId(), requestVo.getName(), requestVo.getBaseLocation(),
				requestVo.getDescription(), requestVo.getDate());
		if (requestVo.getAction().equals(ActionType.CREATE)) {
			try {
				eventBo = repository.save(eventBo);
				status = new StatusVo(StatusType.SUCCESS, "Event has been successfully created");
				responseVo.setId(eventBo.getId());
			} catch (Exception e) {
				LOGGER.error("Exception Occured while saving the event", e);
				status = new StatusVo(StatusType.FAILURE, "Event has not been created - Exception Occured");
			}
			responseVo.setStatus(status);
			response.add(responseVo);
		} else if (requestVo.getAction().equals(ActionType.READ)) {
			if (requestVo.getId() != null) {
				eventBo = repository.findById(requestVo.getId()).get();
				responseVo = new EventResponseVo(eventBo);
				response.add(responseVo);
			} else {
				List<EventBo> eventBoList = repository.findAll();
				response = eventBoList.stream().map(event -> new EventResponseVo(event)).collect(Collectors.toList());;
			}

		} else if (requestVo.getAction().equals(ActionType.UPDATE)) {
			try {
				eventBo = repository.save(eventBo);
				status = new StatusVo(StatusType.SUCCESS, "Event has been successfully updated");
			} catch (Exception e) {
				LOGGER.error("Exception Occured while updating the event", e);
				status = new StatusVo(StatusType.FAILURE, "Event has not been updated - Exception Occured");
			}
			responseVo.setStatus(status);
			response.add(responseVo);
		} else if (requestVo.getAction().equals(ActionType.DELETE)) {
			if(requestVo.getId() != null) {
				eventBo = repository.findById(requestVo.getId()).get();
				repository.delete(eventBo);
				responseVo = new EventResponseVo(eventBo);
				status = new StatusVo(StatusType.SUCCESS, "Event has been successfully deleted");
			}else {
				LOGGER.error("Exception Occured while deleting the event as the Id was null");
				status = new StatusVo(StatusType.FAILURE, "Event has not been deleted - Id field is null");
			}
			responseVo.setStatus(status);
			response.add(responseVo);
		} else {
			throw new Exception("Action Type Not Found");
		}

		return response;
	}
}
