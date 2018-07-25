package com.accenture.javacapability.backbone.service.interfaces;

import java.util.List;

import com.accenture.javacapability.model.Country;

public interface ILocalizationService {

	public List<Country> generateMockData();
	
	public Country getCountry(Long id);
	
}
