package com.cognizant.event.vo;

import java.time.LocalDate;
import java.time.LocalDateTime;

import com.cognizant.common.vo.StatusVo;
import com.cognizant.common.vo.UserVo;
import com.cognizant.enumeration.ActionType;
import com.cognizant.event.bo.EventBo;

public class EventResponseVo {

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
	private String createdBy;
	private LocalDate createdDate;
	private String updatedBy;
	private LocalDate updatedDate;
	private ActionType action;
	private StatusVo status;

	public EventResponseVo(EventRequestVo requestVo) {
		mapRequest(requestVo);
	}

	public EventResponseVo(EventBo eventBo) {
		mapRequest(eventBo);
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

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public LocalDate getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDate createdDate) {
		this.createdDate = createdDate;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public LocalDate getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(LocalDate updatedDate) {
		this.updatedDate = updatedDate;
	}

	public ActionType getAction() {
		return action;
	}

	public void setAction(ActionType action) {
		this.action = action;
	}

	public StatusVo getStatus() {
		return status;
	}

	public void setStatus(StatusVo status) {
		this.status = status;
	}

	private void mapRequest(EventRequestVo requestVo) {
		this.id = requestVo.getId();
		this.name = requestVo.getName();
		this.description = requestVo.getDescription();
		this.date = requestVo.getDate();
		this.startTime = requestVo.getStartTime();
		this.endTime = requestVo.getEndTime();
		this.volunteersRequired = requestVo.getVolunteersRequired();
		this.totalVolunteeringHrs = requestVo.getTotalVolunteeringHrs();
		this.benificiaryName = requestVo.getBenificiaryName();
		this.livesImpacted = requestVo.getLivesImpacted();
		this.venueAddress = requestVo.getVenueAddress();
		this.eventStatus = requestVo.getEventStatus();
		this.pocIds = requestVo.getPocIds();
	}

	public void mapRequest(EventBo event) {
		this.id = event.getId();
		this.name = event.getName();
		this.description = event.getDescription();
		this.date = event.getDate();
		this.startTime = event.getStartTime();
		this.endTime = event.getEndTime();
		this.volunteersRequired = event.getVolunteersRequired();
		this.totalVolunteeringHrs = event.getTotalVolunteeringHrs();
		this.benificiaryName = event.getBenificiaryName();
		this.livesImpacted = event.getLivesImpacted();
		this.venueAddress = event.getVenueAddress();
		this.eventStatus = event.getStatus();
		this.pocIds = event.getPocIds();
		this.createdBy = event.getPocIds();
		this.createdDate = event.getCreatedDate().toLocalDate();
		this.updatedBy = event.getUpdatedBy();
		this.updatedDate = event.getUpdatedDate().toLocalDate();
	}
}
