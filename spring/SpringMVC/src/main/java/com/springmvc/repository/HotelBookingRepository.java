package com.springmvc.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.springmvc.bean.HotelBooking;
import com.springmvc.entity.HotelBookingEntity;
@Repository
@Transactional
public class HotelBookingRepository 
{
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	public void save(HotelBookingEntity boooking)
	{
		hibernateTemplate.save(boooking);
		System.out.println("saved successfully");
	}
	
	public void update(HotelBookingEntity entity)
	{
		System.out.println("update successfully");
		hibernateTemplate.update(entity);
		
	}

}
