package com.pluralsight.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pluralsight.model.Activity;
import com.pluralsight.model.Exercise;
import com.pluralsight.service.ExerciseService;

@Controller
public class MinutesController {

	@Autowired
	private ExerciseService exerciseService;
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
		return exerciseService.getAllActivities();
	}
}
