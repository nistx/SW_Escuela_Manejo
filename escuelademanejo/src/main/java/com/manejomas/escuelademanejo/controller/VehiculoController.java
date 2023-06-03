package com.manejomas.escuelademanejo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VehiculoController {
    @RequestMapping("/Dashboard/Vehiculos")
    public String vehiculo(Model model) {
        model.addAttribute("menuActivo", "veh");
        return "vehiculos";
    }
}
