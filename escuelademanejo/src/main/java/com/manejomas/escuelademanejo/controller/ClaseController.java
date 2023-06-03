package com.manejomas.escuelademanejo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/clase")
public class ClaseController {

    @RequestMapping("/listaClase")
    public String clases(Model model) {
        model.addAttribute("menuActivo", "clase");
        model.addAttribute("itemActivo", "clase_lista");
        return "clase/listaClase";
    }

    @RequestMapping("/nuevaClase")
    public String nuevaClase(Model model) {
        model.addAttribute("menuActivo", "clase");
        model.addAttribute("itemActivo", "clase_nueva");
        return "clase/nuevaClase";
    }
}
