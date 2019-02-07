package com.cognizant.enumeration;

import java.util.Arrays;

public enum ActionType {
	  CREATE,READ,UPDATE,DELETE;
	  
	  public static ActionType getActionType(final String actionType){
		  return Arrays.stream(values()).filter(value -> value.toString().equals(actionType)).findFirst().orElse(null);
	  }
	  
	  
}
