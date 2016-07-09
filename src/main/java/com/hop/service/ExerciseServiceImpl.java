package com.hop.service;

import com.hop.model.Activity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("exerciseService")
public class ExerciseServiceImpl implements ExerciseService {

    public List<Activity> findAllActivities(){
        List<Activity> activities = new ArrayList<Activity>();

        Activity run = new Activity();
        run.setDesc("Run");
        activities.add(run);

        Activity swimming = new Activity();
        swimming.setDesc("Swimming");
        activities.add(swimming);

        Activity bike = new Activity();
        bike.setDesc("Bike");
        activities.add(bike);
        return activities;
    }
}
