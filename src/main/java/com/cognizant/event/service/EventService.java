package com.cognizant.event.service;

import java.util.List;

import com.cognizant.event.vo.EventRequestVo;
import com.cognizant.event.vo.EventResponseVo;

public interface EventService {
	public List<EventResponseVo> event(EventRequestVo requestVo) throws Exception;
}
