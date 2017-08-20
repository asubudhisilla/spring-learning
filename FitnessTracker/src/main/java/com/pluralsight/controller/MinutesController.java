package com.pluralsight.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pluralsight.model.Activity;
import com.pluralsight.model.Exercise;

@Controller
public class MinutesController {

	@RequestMapping(value="/addMinutes")
	public String addMinutes(@ModelAttribute("exercise")Exercise model)
	{
			System.out.println("Minutes exercise:"+model.getMinutes());
			System.out.println("Minutes exercise for activity:"+model.getActivity());
			return "addMinutes";
	}
	@RequestMapping(value="/showMinutes")
	public String showMinutes(@ModelAttribute("exercise")Exercise model)
	{
		model.setMinutes(8945895);
			//System.out.println("Minutes exercise:"+model.getMinutes());	
			return "addMinutes";
	}
	
	@RequestMapping(value="/activities", method=RequestMethod.GET)
	public @ResponseBody List<Activity> getAllActivities()
	{
		List<Activity> ls = new ArrayList<Activity>();
		Activity run = new Activity();
		run.setDesc("Run");
		
		Activity bike = new Activity();
		bike.setDesc("Bike");
		
		Activity swim = new Activity();
		swim.setDesc("Swim");
		
		ls.add(run);
		ls.add(bike);
		ls.add(swim);
		
		return ls;
	}
}
