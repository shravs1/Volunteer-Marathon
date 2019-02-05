package com.cognizant.event.bo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class EventBo {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	private String name;
	private String baseLocation;
	private String description;
	private String date;
	
	
	
	public EventBo(Integer id, String name, String baseLocation, String description, String date) {
		super();
		this.id = id;
		this.name = name;
		this.baseLocation = baseLocation;
		this.description = description;
		this.date = date;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
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
