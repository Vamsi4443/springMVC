package com.springmvc.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.springmvc.bean.HotelBooking;
import com.springmvc.service.HotelbookingService;

@Controller
//@RequestMapping("/hotel")
public class HotelRoomBookingController 
{
	@Autowired
	private HotelbookingService hotelbookingService;
	
	@RequestMapping(path="/room" ,method = RequestMethod.GET)
	public ModelAndView booking()
	{
		return new ModelAndView("room","roombooking",new HotelBooking());
	}
	
	
	@RequestMapping(path="/results" ,method = RequestMethod.POST)
	public ModelAndView save(@Valid @ModelAttribute HotelBooking booking,BindingResult results,ModelMap map)
	{
		hotelbookingService.save(booking);
		//hotelbookingService.save(booking);
		
		if(results.hasErrors())
		{
			return new  ModelAndView("room" ,"roombooking",booking);
		}
		else {
		
		return new ModelAndView("results");
		}
		
		
		
	}
	@RequestMapping(path="/update" ,method = RequestMethod.PUT)
	public ModelAndView update(@ModelAttribute HotelBooking booking,BindingResult results)
	{
		hotelbookingService.update(booking);
		
		if(results.hasErrors())
		{
			return new  ModelAndView("room" ,"roombooking",booking);
		}
		else {
		
		return new ModelAndView("results");
		}
	}
	
	

}
