package com.cognizant.event.vo;

import com.cognizant.common.vo.StatusVo;
import com.cognizant.enumeration.ActionType;

public class EventResponseVo {
	private Integer id;
	private String name;
	private String baseLocation;
	private String description;
	private String date;
	private ActionType action;
	private StatusVo status;
	
	
	
	public EventResponseVo(EventRequestVo requestVo) {
		mapRequest(requestVo);
	}
	
	public EventResponseVo(Integer id, String name, String baseLocation, String description, String date,StatusVo status) {
		this.id = id;
		this.name = name;
		this.baseLocation = baseLocation;
		this.description = description;
		this.date = date;
		this.status = status;
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
	
	public StatusVo getStatus() {
		return status;
	}
	public void setStatus(StatusVo status) {
		this.status = status;
	}
	
	public ActionType getAction() {
		return action;
	}

	public void setAction(ActionType action) {
		this.action = action;
	}

	private void mapRequest(EventRequestVo requestVo) {
		this.id = requestVo.getId();
		this.name = requestVo.getName();
		this.baseLocation = requestVo.getBaseLocation();
		this.description = requestVo.getDescription();
		this.date = requestVo.getDate();
		this.action = requestVo.getAction();
	}
}
