package com.pinanims.web.models;

public class Animal {
	private String name;
	private String breed;
	private int weight;
	
	public Animal (String name, String breed, int weight) {
		this.name = name;
		this.breed = breed;
		this.setWeight(weight);	
	}
	
	public String getName() {
		return name;
	}
	
	public String getBreed() {
		return breed;
	}
	
	public int getWeight() {
		return weight;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setBreed(String breed) {
		this.breed = breed;
	}
	
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
}
