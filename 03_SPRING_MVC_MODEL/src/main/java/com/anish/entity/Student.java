package com.anish.entity;

import org.springframework.stereotype.Component;

@Component
public class Student {

	private int Id;
	private String Name;
	private Double fee;
	
	public Double getFee() {
		return fee;
	}
	public void setFee(Double fee) {
		this.fee = fee;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	
	
}
