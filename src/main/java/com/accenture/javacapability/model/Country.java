package com.accenture.javacapability.model;

import java.util.List;

public class Country {

	private Long id;
	
	private String name;
	
	private String countryCode;
	
	private List<String> lstCities;
	
	public Country() {
		super();
	}

	public Country(Long id, String name, String countryCode, List<String> lstCities) {
		super();
		this.id = id;
		this.name = name;
		this.countryCode = countryCode;
		this.lstCities = lstCities;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public List<String> getLstCities() {
		return lstCities;
	}

	public void setLstCities(List<String> lstCities) {
		this.lstCities = lstCities;
	}
	
	
}
