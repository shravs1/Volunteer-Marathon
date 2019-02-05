package com.cognizant.event.dao;

import com.cognizant.event.bo.EventBo;

public interface EventDao {
	
	public Boolean saveEvent(EventBo event);
	
}
