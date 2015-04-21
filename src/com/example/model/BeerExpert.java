package com.example.model;

import java.util.*;

public class BeerExpert {
	public List<String> getBrands(String color) {
		List<String> brands = new ArrayList<String>();

		switch (color) {
			case "amber":
				brands.add("Jack Amber");
				brands.add("Red Moose");
				break;
			default:
				brands.add("Jail Pale Ale");
				brands.add("Grout Stout");				
		}
		return brands;
	}
}

