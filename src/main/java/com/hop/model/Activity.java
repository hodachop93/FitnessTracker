package com.hop.model;

import javax.validation.constraints.NotNull;

/**
 * Created by Hop Dac Ho on 09/07/2016.
 */
public class Activity {
    @NotNull
    private String desc;

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
