package com.bro.bean;

/**
 * Entity to represent property configuration.
 * @author Zubair Shaikh
 * @version 1.0
 */
public class Configuration {
	private Integer configId;
	private String configType;	// Flat/Shop
	private Integer sqftArea;
	private Double sqftRate;

	private Project project;
	
	public Configuration() {
	}
	
}
