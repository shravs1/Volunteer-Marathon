package com.cognizant.event.dao;

import org.springframework.beans.factory.annotation.Autowired;

import com.cognizant.event.bo.EventBo;
import com.cognizant.event.repository.EventRepository;
import com.cognizant.validators.ObjectValidator;

public class EventDaoImpl implements EventDao {
	
	@Autowired
	EventRepository repository;

	@Override
	public Boolean saveEvent(EventBo event) {
		return ObjectValidator.isNotNull(repository.save(event)); 
	}

}
