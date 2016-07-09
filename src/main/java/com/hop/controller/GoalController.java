package com.hop.controller;

import com.hop.model.Goal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

/**
 * Created by Hop Dac Ho on 09/07/2016.
 */
@Controller
@SessionAttributes("goal")
public class GoalController {

    @RequestMapping(value = "/addGoal", method = RequestMethod.GET)
    public String addGoal(Model model) {
        Goal goal = new Goal();
        model.addAttribute("goal", goal);
        return "addGoal";
    }

    @RequestMapping(value = "/addGoal", method = RequestMethod.POST)
    public String updateGoal(@ModelAttribute("goal") Goal goal){
        return "redirect:addMinutes.html";
    }
}
