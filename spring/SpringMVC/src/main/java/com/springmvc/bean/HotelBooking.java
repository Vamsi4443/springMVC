package com.springmvc.bean;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.lang.NonNull;

public class HotelBooking 
{
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	private int days;
	private int cost;
	@NotEmpty(message = "required")
	private String name;
	
	 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDays() {
		return days;
	}
	public void setDays(int days) {
		this.days = days;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public String getRating() {
		return name;
	}
	public void setRating(String rating) {
		this.name = rating;
	}
	@Override
	public String toString() {
		return "HotelBooking [days=" + days + ", cost=" + cost + ", name=" + name + "]";
	}
	

}
