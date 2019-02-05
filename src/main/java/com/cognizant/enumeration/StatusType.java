package com.cognizant.enumeration;

import java.util.Arrays;

public enum StatusType {
	
	SUCCESS,FAILURE;
	
	 public static StatusType getActionType(final String statusType){
		  return Arrays.stream(values()).filter(value -> StatusType.valueOf(statusType).equals(statusType)).findFirst().orElse(null);
	  }

}
