package com.validation.demo;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@ApplicationScoped              //Value will remain the same in all user/browsers/tabs
                              //if we use @SessionScoped value will remain the same for same user/tabs different for different users/browsers ====== Unique for each user
                              //if we use @SessionScoped (It's a default scope) increament only once so one time use only
public class Counter {
	
	private int value = 0;

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	public String increament()
	{
		value++;
		return "counter_response";
	}

}
