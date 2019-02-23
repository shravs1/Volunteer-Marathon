package com.cognizant.event.bo;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;

import org.springframework.lang.NonNull;

import com.cognizant.event.vo.EventRequestVo;
import com.cognizant.validators.ObjectValidator;

@Entity
@Table(name = "event_t")
public class EventBo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "event_id")
	private Integer id;

	@NonNull
	@Column(name = "event_name")
	private String name;

	@NonNull
	@Column(name = "event_description")
	private String description;

	@NonNull
	@Column(name = "event_date")
	private LocalDate date;

	@Column(name = "event_start_time")
	private LocalDateTime startTime;

	@Column(name = "event_end_time")
	private LocalDateTime endTime;

	@NonNull
	@Column(name = "volunteers_required")
	private Integer volunteersRequired;

	@Column(name = "total_volunteering_hrs")
	private Integer totalVolunteeringHrs;

	@Column(name = "total_transport_hrs")
	private Integer totalTransportHrs;

	@Column(name = "benificiary_name")
	private String benificiaryName;

	@Column(name = "lives_impacted")
	private Short livesImpacted;

	@Column(name = "venue_address")
	private String venueAddress;

	@Column(name = "event_status")
	private String status;

	@Column(name = "poc_ids")
	private String pocIds;

	@NonNull
	@Column(name = "created_by")
	private String createdBy;

	@NonNull
	@Column(name = "created_date")
	private LocalDateTime createdDate;

	@NonNull
	@Column(name = "updated_by")
	private String updatedBy;

	@NonNull
	@Column(name = "updated_date")
	private LocalDateTime updatedDate;




	public EventBo(String name, String description, LocalDate date, LocalDateTime startTime, LocalDateTime endTime,
			Integer volunteersRequired, Integer totalVolunteeringHrs, Integer totalTransportHrs, String benificiaryName,
			Short livesImpacted, String venueAddress, String status, String pocIds, String createdBy, LocalDateTime createdDate,
			String updatedBy, LocalDateTime updatedDate) {
		this.name = name;
		this.description = description;
		this.date = date;
		this.startTime = startTime;
		this.endTime = endTime;
		this.volunteersRequired = volunteersRequired;
		this.totalVolunteeringHrs = totalVolunteeringHrs;
		this.totalTransportHrs = totalTransportHrs;
		this.benificiaryName = benificiaryName;
		this.livesImpacted = livesImpacted;
		this.venueAddress = venueAddress;
		this.status = status;
		this.pocIds = pocIds;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.updatedBy = updatedBy;
		this.updatedDate = updatedDate;
	}

	public EventBo(EventRequestVo requestVo) {
		mapRequest(requestVo);
	}

	public EventBo() {
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
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
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

	public LocalDateTime getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}
	public String getUpdatedBy() {
		return updatedBy;
	}
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}
	public LocalDateTime getUpdatedDate() {
		return updatedDate;
	}
	public void setUpdatedDate(LocalDateTime updatedDate) {
		this.updatedDate = updatedDate;
	}

	private void mapRequest(EventRequestVo requestVo) {
		this.id = requestVo.getId();
		this.name = requestVo.getName();
		this.description = requestVo.getDescription();
		this.date = requestVo.getDate();
		this.startTime  = requestVo.getStartTime();
		this.endTime = requestVo.getEndTime();
		this.volunteersRequired = requestVo.getVolunteersRequired();
		this.totalVolunteeringHrs = requestVo.getTotalVolunteeringHrs();
		this.totalTransportHrs = requestVo.getTotalTransportHrs();
		this.benificiaryName = requestVo.getBenificiaryName();
		this.livesImpacted = requestVo.getLivesImpacted();
		this.venueAddress = requestVo.getVenueAddress();
		this.status = requestVo.getEventStatus();
		this.pocIds = requestVo.getPocIds();
		this.createdBy = requestVo.getUser().getUserName();
		this.updatedBy = requestVo.getUser().getUserName();
	}


	@PrePersist
	protected void onCreate() {
		createdDate =  LocalDateTime.now(ZoneId.of("Asia/Kolkata"));
		updatedDate = LocalDateTime.now(ZoneId.of("Asia/Kolkata"));
	}

	@PreUpdate
	protected void onUpdate() {
		updatedDate = LocalDateTime.now(ZoneId.of("Asia/Kolkata"));
	}


	public  void setEvent(EventBo event) {
		try {
			Method[] methods = event.getClass().getMethods();
			for(Method method : methods){
				if(isGetter(method)) {
					Object obj = method.invoke(event);
					if(ObjectValidator.isNotNull(obj)) {
						Method setterMethod  = this.getClass().getMethod("set"+method.getName().substring(3,method.getName().length()),obj.getClass());
						setterMethod.invoke(this, obj);
					}

				}
			}
		}catch (SecurityException
				| IllegalArgumentException 
				| IllegalAccessException 
				| InvocationTargetException 
				| NoSuchMethodException e) {
			e.printStackTrace();
		}
	}

	public static boolean isGetter(Method method){
		if(!method.getName().startsWith("get") || method.getName().equals("getClass"))  return false;
		if(method.getParameterTypes().length != 0)   return false;  
		if(void.class.equals(method.getReturnType())) return false;
		return true;
	}

}
