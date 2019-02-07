package com.cognizant.event.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.common.vo.StatusVo;
import com.cognizant.enumeration.ActionType;
import com.cognizant.enumeration.StatusType;
import com.cognizant.event.bo.EventDocumentBo;
import com.cognizant.event.repository.EventMongoRepository;
import com.cognizant.event.vo.EventRequestVo;
import com.cognizant.event.vo.EventResponseVo;

@Service
public class EventServiceImpl implements EventService {

private static final Logger LOGGER = LogManager.getLogger(EventServiceImpl.class);
	
	/*@Autowired
	EventRepository repository;*/
	
	@Autowired
	EventMongoRepository mongoRepository;

	public EventResponseVo event(EventRequestVo requestVo) {
		EventResponseVo responseVo = new EventResponseVo(requestVo);
		if(requestVo.getAction().equals(ActionType.CREATE)) {
			EventDocumentBo eventBo = new EventDocumentBo(requestVo.getName(),requestVo.getBaseLocation(),requestVo.getDescription(),requestVo.getDate());
			try {
				EventDocumentBo response = mongoRepository.save(eventBo);
				responseVo.setId(response.getId());
				StatusVo status = new StatusVo(StatusType.SUCCESS, "Event has been successfully created");
				responseVo.setStatus(status);
			}catch(Exception e) {
				LOGGER.error("Exception Occured When saving the event",e);
				StatusVo status = new StatusVo(StatusType.FAILURE, "Event has not been created - Exception Occured");
				responseVo.setStatus(status);
			}
			
		}
		return responseVo;
	}
}
