package com.harsh.emi_calculator.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class EmiController {

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @PostMapping("/calculate")
    public String calculate(
            @RequestParam double principal,
            @RequestParam double rate,
            @RequestParam int time,
            Model model) {

        double monthlyRate = rate / 12 / 100;
        int months = time * 12;

        double emi = (principal * monthlyRate *
                Math.pow(1 + monthlyRate, months))
                / (Math.pow(1 + monthlyRate, months) - 1);

        model.addAttribute("emi", String.format("%.2f", emi));

        return "result";
    }
}