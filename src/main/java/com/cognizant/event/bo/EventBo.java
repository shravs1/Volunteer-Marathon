package com.cognizant.event.bo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="Event")
public class EventBo {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;

	@Column(name="Name")
	@NotNull
	@Size(min=3, message="Name should have atleast 3 characters")
	private String name;
	@NotNull
	@Size(min=4, message="Location should have atleast 4 characters")
	@Column(name="Location")
	private String baseLocation;
	@NotNull
	@Size(min=10, message="Description should have atleast 10 characters")
	@Column(name="Description")
	private String description;
	@NotNull
	@Size(min=7, message="Event Date should be in the format dd-mm-yyyy")
	@Column(name="Event_Date")
	private String date;



	public EventBo(Integer id, String name, String baseLocation, String description, String date) {
		this.id = id;
		this.name = name;
		this.baseLocation = baseLocation;
		this.description = description;
		this.date = date;
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

