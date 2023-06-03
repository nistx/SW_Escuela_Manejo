package com.manejomas.escuelademanejo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EstudianteController {
    @RequestMapping("/Dashboard/ListaEstudiante")
    public String estudiantes(Model model) {
        model.addAttribute("menuActivo", "estu");
        model.addAttribute("itemActivo", "estu_lista");
        return "listaEstudiante";
    }

    @RequestMapping("/Dashboard/NuevoEstudiante")
    public String nuevoEstudiante(Model model) {
        model.addAttribute("menuActivo", "estu");
        model.addAttribute("itemActivo", "estu_nuevo");
        return "nuevoEstudiante";
    }
}
