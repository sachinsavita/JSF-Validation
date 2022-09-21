package com.validation.demo;

import java.util.*;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;

@ManagedBean      //1.
public class Student {
	
	
	private String firstName;
	private String lastName;
	private String country;
	private String favouriteLanguage;
	private String skills[];
	private String email;
	private String phoneNumber;
	private String courseCode;
	private String postalCode;
	private int freePasses;
	//list of counties for drop down list
			List<String> countryOptions;
	
	//no-arg constructor    //2.
	public Student() {
		
		//Pre populate
		firstName = "Rajesh";
		lastName="Shukla";
		country = "India";
		favouriteLanguage = "Java";
		skills = new String[] {"Spring","JSF"};
		
		//populate the list of countries
		countryOptions = new ArrayList<>();
		
		countryOptions.add("Brazil");
		countryOptions.add("India");
		countryOptions.add("Russia");
		countryOptions.add("Oman");
		countryOptions.add("France");
		
	}
	
	
	//validator method
	public void validateCourseCode(FacesContext context,
			                       UIComponent component,
			                       Object value)throws ValidatorException
	{
		if(value==null)
		{
			return;
		}
		
		String data = value.toString();
		//Corse Code must start with LUV
		
		if(!data.startsWith("LUV"))
		{
			FacesMessage message = new FacesMessage("Course Code must start with LUV");
			
			throw new ValidatorException(message);
		}
		
	}

	
	//Getters and Setters       //3.
	public List<String> getCountryOptions() {
		return countryOptions;
	}

	
	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}


	public String getFavouriteLanguage() {
		
		return favouriteLanguage;
	}


	public void setFavouriteLanguage(String favouriteLanguage) {
		
		this.favouriteLanguage = favouriteLanguage;
	}


	public String[] getSkills() {
		return skills;
	}


	public void setSkills(String[] skills) {
		this.skills = skills;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPostalCode() {
		return postalCode;
	}


	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}


	public int getFreePasses() {
		return freePasses;
	}


	public void setFreePasses(int freePasses) {
		this.freePasses = freePasses;
	}


	public String getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	public String getCourseCode() {
		return courseCode;
	}


	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}

	
	

}
