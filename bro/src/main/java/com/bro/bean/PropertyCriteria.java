package com.bro.bean;

/**
 * Bean to represent search criteria for users.
 * @author Zubair Shaikh
 * @version 1.0
 */
public class PropertyCriteria {
	private String city;
	private String config;	// Flat/Shop/Plot
	private String type;	// Rent/Sell/Lease
	private Double minRange;
	private Double maxRange;
	
	public PropertyCriteria() {
	}
	
}
