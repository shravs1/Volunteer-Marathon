package com.cognizant.event.repository;

import org.springframework.data.repository.CrudRepository;

import com.cognizant.event.bo.EventBo;

public interface EventRepository extends CrudRepository<EventBo, Integer> {

}
