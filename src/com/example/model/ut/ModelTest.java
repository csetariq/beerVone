package com.example.model.ut;

import com.example.model.BeerExpert;

import java.util.*;

import org.junit.*;
import static org.junit.Assert.*;

public class ModelTest {
	private static BeerExpert expert;
	private static List<String> expectedResult;

	@BeforeClass
	public static void setUpInstance() {
		expert = new BeerExpert();
		expectedResult = new ArrayList<String>();
	}
	
	@After
	public void clearState() {
		expectedResult.clear();
	}

	@Test
	public void testAdviceAmber() {

		expectedResult.add("Jack Amber");
		expectedResult.add("Red Moose");

		List<String> result = expert.getBrands("amber");

		assertEquals(expectedResult, result);
	}
	
	@Test
	public void testAdviceOthers() {

		expectedResult.add("Jail Pale Ale");
		expectedResult.add("Grout Stout");

		List<String> result = expert.getBrands("light");
		assertEquals(expectedResult, result);

		result = expert.getBrands("brown");
		assertEquals(expectedResult, result);

		result = expert.getBrands("dark");
		assertEquals(expectedResult, result);

	}

}

