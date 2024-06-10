package com.edureka.testngtestcases;

import org.testng.annotations.Test;

public class FactoryAnnotationExample {

	public String searchData = "";
	
	public FactoryAnnotationExample(String searchData){
		this.searchData = searchData;
	}
	@Test
	public void SearchTestCase() {
		System.out.println("The search Term is " + searchData);
	}
}
