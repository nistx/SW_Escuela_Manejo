package com.manejomas.escuelademanejo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ClaseController {

    @RequestMapping("/Dashboard/ListaClase")
    public String clases(Model model) {
        model.addAttribute("menuActivo", "clase");
        model.addAttribute("itemActivo", "clase_lista");
        return "listaClase";
    }

    @RequestMapping("/Dashboard/NuevaClase")
    public String nuevaClase(Model model) {
        model.addAttribute("menuActivo", "clase");
        model.addAttribute("itemActivo", "clase_nueva");
        return "nuevaClase";
    }
}
