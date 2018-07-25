package com.accenture.javacapability.backbone.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.accenture.javacapability.backbone.service.interfaces.ILocalizationService;
import com.accenture.javacapability.model.Country;

@Service("localizationService")
public class LocalizationService implements ILocalizationService {

	private static List<Country> lstCountries = new ArrayList<>();
	
	
	@Override
	public List<Country> generateMockData() {
		List<String> c1Cities= new ArrayList<>();
		List<String> c2Cities= new ArrayList<>();	
		List<String> c3Cities= new ArrayList<>();	
		c1Cities.add("Buenos Aires");
		c1Cities.add("La Plata");
		
		c2Cities.add("Montevideo");
		c2Cities.add("Colonia");
		
		c3Cities.add("Brasilia");
		c3Cities.add("Rio de Janeiro");
		Country c1 = new Country(1L, "Argentina", "AR", c1Cities);
		Country c2 = new Country(2L, "Uruguay", "UY", c2Cities);
		Country c3 = new Country(3L, "Brasil", "BR", c3Cities);

		lstCountries.add(c1);
		lstCountries.add(c2);
		lstCountries.add(c3);
		
		return lstCountries;
		
	}

	@Override
	public Country getCountry(Long id) {
		Optional<Country> optCountry = lstCountries.parallelStream().filter(c -> c.getId().equals(id)).findFirst();
		return (optCountry.isPresent()?optCountry.get():null);
	}

	
	
	
}
