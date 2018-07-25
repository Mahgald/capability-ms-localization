package com.accenture.javacapability.backbone.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.accenture.javacapability.backbone.service.interfaces.ILocalizationService;
import com.accenture.javacapability.model.Country;

@RestController("/")
public class LocalizationController {

	@Autowired
	private ILocalizationService localizationService;
	
	
	@GetMapping("generateMockData")
	public ResponseEntity<?> generateMockData() {
		return new ResponseEntity<>(localizationService.generateMockData(),HttpStatus.OK);
	}
	

	@GetMapping("country/{id}")
	public ResponseEntity<?> getCountryById(@PathVariable("id")Long id) {
		Country country = localizationService.getCountry(id);
		
		if(country != null)
			return new ResponseEntity<>(country,HttpStatus.OK);
		
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		
	}

	@GetMapping("countryMS/{id}")
	public String getCountryMsCommunication(@PathVariable("id")Long id) {
		Country country = localizationService.getCountry(id);
		
		if(country != null)
			return country.getName();
		
		return "No existe";
		
	}
	
	
	
	
}
