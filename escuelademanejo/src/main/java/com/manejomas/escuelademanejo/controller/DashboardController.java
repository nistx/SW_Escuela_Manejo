package com.manejomas.escuelademanejo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DashboardController {
    @RequestMapping("/Dashboard/Inicio")
    public String home(Model model) {
        model.addAttribute("menuActivo", "ini");
        return "inicio";
    }
}
