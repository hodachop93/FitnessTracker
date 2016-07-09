package com.hop.controller;

import com.hop.model.Activity;
import com.hop.model.Exercise;
import com.hop.service.ExerciseService;
import com.hop.service.GoalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by Hop Dac Ho on 08/07/2016.
 */
@Controller
public class MinutesController {

    @Autowired
    private ExerciseService exerciseService;

    @Autowired
    private GoalService goalService;

    /*@RequestMapping(value = "/addMinutes")
    public String addMinutes(@ModelAttribute("exercise") Exercise exercise) {
        System.out.println("exercise: " + exercise.getMinutes());
        return "redirect:addMoreMinutes";
    }*/

    @RequestMapping(value = "/addMoreMinutes")
    public String addMoreMinutes(@ModelAttribute("exercise") Exercise exercise) {
        System.out.println("exercising: " + exercise.getMinutes());
        return "addMinutes";
    }

    @RequestMapping(value = "/addMinutes")
    public String addMinutes(@ModelAttribute("exercise") Exercise exercise) {
        System.out.println("exercise: " + exercise.getMinutes());
        System.out.println("activity of exercise: " + exercise.getActivity());
        return "addMinutes";
    }

    @RequestMapping(value = "/activities", method = RequestMethod.GET)
    public
    @ResponseBody
    List<Activity> findAllActivities() {
        return exerciseService.findAllActivities();
    }
}
