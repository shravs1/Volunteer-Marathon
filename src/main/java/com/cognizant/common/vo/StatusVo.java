package com.cognizant.common.vo;

import com.cognizant.enumeration.StatusType;

public class StatusVo {
	
	private StatusType status;
	private String message;
	
	
	public StatusVo(StatusType status, String message) {
		this.status = status;
		this.message = message;
	}
	
	public StatusType getStatus() {
		return status;
	}
	public void setStatus(StatusType status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	

}
