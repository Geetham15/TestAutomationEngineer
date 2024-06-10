package com.edureka.testngtestcases;

import org.testng.annotations.Factory;

public class SearchDataFactory {
	@Factory
	public Object[] Searchmethod() {
		return new Object[] {
				new FactoryAnnotationExample("Shirts"),
				new FactoryAnnotationExample("Sarees")
		};
	}
}
