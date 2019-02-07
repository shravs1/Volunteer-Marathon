package com.cognizant.event.bo;


import org.springframework.data.annotation.Id;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class EventDocumentBo {
	
	@Id
	private String id;
	private String name;
	private String baseLocation;
	private String description;
	private String date;
	
	
	
	public EventDocumentBo(String name, String baseLocation, String description, String date) {
		super();
		this.name = name;
		this.baseLocation = baseLocation;
		this.description = description;
		this.date = date;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBaseLocation() {
		return baseLocation;
	}
	public void setBaseLocation(String baseLocation) {
		this.baseLocation = baseLocation;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	
}


