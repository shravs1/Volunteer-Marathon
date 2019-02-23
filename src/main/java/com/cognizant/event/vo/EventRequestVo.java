package com.cognizant.event.vo;

import java.time.LocalDate;
import java.time.LocalDateTime;

import com.cognizant.common.vo.UserVo;
import com.cognizant.enumeration.ActionType;

public class EventRequestVo {
	
	private Integer id;
	private String name;
	private String description;
	private LocalDate date;
	private LocalDateTime startTime;
	private LocalDateTime endTime;
	private Integer volunteersRequired;
	private Integer totalVolunteeringHrs;
	private Integer totalTransportHrs;
	private String benificiaryName;
	private Short livesImpacted;
	private String venueAddress;
	private String eventStatus;
	private String pocIds;
	private ActionType action;
	private UserVo user;
	
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public LocalDateTime getStartTime() {
		return startTime;
	}
	public void setStartTime(LocalDateTime startTime) {
		this.startTime = startTime;
	}
	public LocalDateTime getEndTime() {
		return endTime;
	}
	public void setEndTime(LocalDateTime endTime) {
		this.endTime = endTime;
	}
	public Integer getVolunteersRequired() {
		return volunteersRequired;
	}
	public void setVolunteersRequired(Integer volunteersRequired) {
		this.volunteersRequired = volunteersRequired;
	}
	public Integer getTotalVolunteeringHrs() {
		return totalVolunteeringHrs;
	}
	public void setTotalVolunteeringHrs(Integer totalVolunteeringHrs) {
		this.totalVolunteeringHrs = totalVolunteeringHrs;
	}
	public Integer getTotalTransportHrs() {
		return totalTransportHrs;
	}
	public void setTotalTransportHrs(Integer totalTransportHrs) {
		this.totalTransportHrs = totalTransportHrs;
	}
	public String getBenificiaryName() {
		return benificiaryName;
	}
	public void setBenificiaryName(String benificiaryName) {
		this.benificiaryName = benificiaryName;
	}
	public Short getLivesImpacted() {
		return livesImpacted;
	}
	public void setLivesImpacted(Short livesImpacted) {
		this.livesImpacted = livesImpacted;
	}
	public String getVenueAddress() {
		return venueAddress;
	}
	public void setVenueAddress(String venueAddress) {
		this.venueAddress = venueAddress;
	}
	public String getEventStatus() {
		return eventStatus;
	}
	public void setEventStatus(String eventStatus) {
		this.eventStatus = eventStatus;
	}
	public String getPocIds() {
		return pocIds;
	}
	public void setPocIds(String pocIds) {
		this.pocIds = pocIds;
	}
	public ActionType getAction() {
		return action;
	}
	public void setAction(ActionType action) {
		this.action = action;
	}
	public UserVo getUser() {
		return user;
	}
	public void setUser(UserVo user) {
		this.user = user;
	}
}
