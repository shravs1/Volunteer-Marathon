package com.cognizant.event.service;

import org.springframework.stereotype.Service;

import com.cognizant.common.vo.StatusVo;
import com.cognizant.enumeration.ActionType;
import com.cognizant.enumeration.StatusType;
import com.cognizant.event.bo.EventBo;
import com.cognizant.event.dao.EventDao;
import com.cognizant.event.dao.EventDaoImpl;
import com.cognizant.event.vo.EventRequestVo;
import com.cognizant.event.vo.EventResponseVo;

@Service
public class EventService {

	public EventResponseVo event(EventRequestVo requestVo) {
		EventDao dao = new EventDaoImpl();
		EventResponseVo responseVo = new EventResponseVo(requestVo);
		if(requestVo.getAction().equals(ActionType.CREATE)) {
			EventBo eventBo = new EventBo(requestVo.getId(),requestVo.getName(),requestVo.getBaseLocation(),requestVo.getDescription(),requestVo.getDate());
			Boolean result = dao.saveEvent(eventBo);

			if(result) {
				StatusVo status = new StatusVo(StatusType.SUCCESS, "Event has been successfully created");
				responseVo.setStatus(status);
			}else {
				StatusVo status = new StatusVo(StatusType.FAILURE, "Event has not been created - Exception Occured");
				responseVo.setStatus(status);
			}
		}
		return responseVo;
	}
}
