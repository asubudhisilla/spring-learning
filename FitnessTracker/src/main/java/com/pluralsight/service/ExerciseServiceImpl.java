package com.pluralsight.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.pluralsight.model.Activity;

@Service
public class ExerciseServiceImpl implements ExerciseService {

	public List<Activity> getAllActivities() {
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
