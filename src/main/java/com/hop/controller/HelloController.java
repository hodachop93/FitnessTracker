package com.hop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Hop Dac Ho on 07/07/2016.
 */
@Controller
public class HelloController {

    @RequestMapping(value = "/greeting")
    public String sayHello(Model model) {
        model.addAttribute("greeting", "Hello world");
        return "hello";
    }
}
