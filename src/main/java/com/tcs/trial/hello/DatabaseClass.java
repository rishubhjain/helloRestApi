package com.tcs.trial.hello;

import java.util.HashMap;
import java.util.Map;

public class DatabaseClass {
	private static Map<Long,Message> message =  new HashMap<>();
	private static Map<Long,Message> profiles = new HashMap<>();
	
	public static Map<Long,Message> getMessage() {
		return message;
	}
	public static Map<Long,Message> getProfiles() {
		return profiles;		
	}
}
