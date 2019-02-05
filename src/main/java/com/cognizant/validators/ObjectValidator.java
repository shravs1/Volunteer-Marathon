package com.cognizant.validators;

public class ObjectValidator {
	
	public static Boolean isNull(Object obj) {
		return null==obj;
	}
	
	public static Boolean isNotNull(Object obj) {
		return !isNull(obj);
	}

}
