package com.cognizant.event.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.cognizant.event.bo.EventDocumentBo;

public interface EventMongoRepository extends MongoRepository<EventDocumentBo, Integer>  {

}
