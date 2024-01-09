package com.springmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springmvc.bean.HotelBooking;
import com.springmvc.entity.HotelBookingEntity;
import com.springmvc.repository.HotelBookingRepository;

@Service
public class HotelBookingServiceImplementation  implements HotelbookingService
{
	@Autowired
	private HotelBookingRepository bookingRepository;

	@Override
	public void save(HotelBooking booking) {
		
		HotelBookingEntity entity=new HotelBookingEntity();
		entity.setCost(booking.getCost());
		entity.setDays(booking.getDays());
		entity.setName(booking.getName());
		bookingRepository.save(entity);
	}

	
	public void update(HotelBooking booking)
	{
		HotelBookingEntity entity=new HotelBookingEntity();
		entity.setId(booking.getId());
		entity.setCost(booking.getCost());
		entity.setDays(booking.getDays());
		entity.setName(booking.getName());
		
		bookingRepository.update(entity);
	}
	
	
	
	

}
