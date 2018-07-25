package com.accenture.javacapability.backbone.model;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;
import org.meanbean.test.BeanTester;

import com.accenture.javacapability.model.Country;

public class CountryTest {

	@Test
	public void countryTest() {
		BeanTester beanTester = new BeanTester();
		beanTester.testBean(Country.class);
	}
	
	@Test
	public void countryTest2() {
		Country country = new Country(1L, "Argentina", "AR", new ArrayList<>());
		assertNotNull(country);
	}
}
