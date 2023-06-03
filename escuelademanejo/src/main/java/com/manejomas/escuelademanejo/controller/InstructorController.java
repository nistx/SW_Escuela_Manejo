package com.manejomas.escuelademanejo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/instructor")
public class InstructorController {
    @RequestMapping("/listaInstructor")
    public String intructores(Model model) {
        model.addAttribute("menuActivo", "inst");
        model.addAttribute("itemActivo", "inst_lista");
        return "instructor/listaInstructor";
    }

    @RequestMapping("/nuevoInstructor")
    public String nuevoInstructor(Model model) {
        model.addAttribute("menuActivo", "inst");
        model.addAttribute("itemActivo", "inst_nuevo");
        return "instructor/nuevoInstructor";
    }
}
