package com.manejomas.escuelademanejo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class InstructorController {
    @RequestMapping("/Dashboard/ListaInstructor")
    public String intructores(Model model) {
        model.addAttribute("menuActivo", "inst");
        model.addAttribute("itemActivo", "inst_lista");
        return "listaInstructor";
    }

    @RequestMapping("/Dashboard/NuevoInstructor")
    public String nuevoInstructor(Model model) {
        model.addAttribute("menuActivo", "inst");
        model.addAttribute("itemActivo", "inst_nuevo");
        return "nuevoInstructor";
    }
}
