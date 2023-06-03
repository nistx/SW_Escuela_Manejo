package com.manejomas.escuelademanejo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/dashboard")
public class DashboardController {
    @RequestMapping("/inicio")
    public String home(Model model) {
        model.addAttribute("menuActivo", "ini");
        return "inicio";
    }
}
