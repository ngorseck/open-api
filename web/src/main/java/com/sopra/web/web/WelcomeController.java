package com.sopra.web.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WelcomeController {

    private final Logger logger = LoggerFactory.getLogger(WelcomeController.class);

    @GetMapping("/")
    public String welcome(@RequestParam(name = "query",
            required = false, defaultValue = "123456") String query, Model model) {

        logger.debug("Welcome to mkyong.com... Query : {}", query);

        model.addAttribute("query", query);

        return "index";
    }

}
