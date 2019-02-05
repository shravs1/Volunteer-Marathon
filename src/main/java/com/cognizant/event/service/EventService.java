package com.cognizant.event.service;

import com.cognizant.event.vo.EventRequestVo;
import com.cognizant.event.vo.EventResponseVo;

public interface EventService {
	public EventResponseVo event(EventRequestVo requestVo);
}
