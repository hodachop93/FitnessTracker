package com.hop.service;

import com.hop.model.Goal;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Hop Dac Ho on 09/07/2016.
 */
@Service("goalService")
public class GoalServiceImpl implements GoalService {

    public List<Goal> findAllGoals() {
        List<Goal> goals = new ArrayList<Goal>();
        return goals;
    }
}
