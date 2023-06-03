package com.manejomas.escuelademanejo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/estudiante")
public class EstudianteController {
    @RequestMapping("/listaEstudiante")
    public String estudiantes(Model model) {
        model.addAttribute("menuActivo", "estu");
        model.addAttribute("itemActivo", "estu_lista");
        return "estudiante/listaEstudiante";
    }

    @RequestMapping("/nuevoEstudiante")
    public String nuevoEstudiante(Model model) {
        model.addAttribute("menuActivo", "estu");
        model.addAttribute("itemActivo", "estu_nuevo");
        return "estudiante/nuevoEstudiante";
    }
}
