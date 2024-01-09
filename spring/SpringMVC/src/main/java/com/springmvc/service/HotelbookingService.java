package com.springmvc.service;

import java.util.List;

import com.springmvc.bean.HotelBooking;
import com.springmvc.entity.HotelBookingEntity;

public interface HotelbookingService 
{
	void save(HotelBooking booking);
	void update(HotelBooking booking);

}
