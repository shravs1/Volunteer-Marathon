package com.cognizant.event.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cognizant.event.bo.EventBo;


public interface EventRepository extends JpaRepository<EventBo, Integer> {

}
