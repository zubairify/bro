package com.bro.bean;

/**
 * Entity to represent property for sell/rent/lease
 * @author Zubair Shaikh
 * @version 1.0
 */
public class Property {
	private Integer propId;
	private String propConfig;	// Flat/Shop/Plot
	private String offerType;	// Sell/Lease/Rent
	private Double offerPrice;
	private Double sqftRate;
	private String city;
	private String area;
	private String address;
	private String landmark;

	private Owner owner;
	private Broker broker;
	
	public Property() {
	}
	
}
