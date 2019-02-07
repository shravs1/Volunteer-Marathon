package com.cognizant.event.vo;

import com.cognizant.enumeration.ActionType;

public class EventRequestVo {
	
	private String name;
	private String baseLocation;
	private String description;
	private String date;
	private ActionType action;
	
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
	public ActionType getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = ActionType.valueOf(action);
	}
}
