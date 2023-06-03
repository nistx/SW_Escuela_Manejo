package com.manejomas.escuelademanejo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.manejomas.escuelademanejo.model.entidad.Estudiante;
import com.manejomas.escuelademanejo.model.service.IEstudianteService;

@Controller
@RequestMapping("/estudiante")
public class EstudianteController {
    @Autowired
    private IEstudianteService estudianteService;

    @RequestMapping("/listaEstudiante")
    public String estudiantes(Model model) {
        model.addAttribute("menuActivo", "estu");
        model.addAttribute("itemActivo", "estu_lista");
        return "estudiante/listaEstudiante";
    }

    @RequestMapping("/nuevoEstudiante")
    public String nuevoEstudiante(Model model) {
        // Guardar Estudiante
        Estudiante estudiante = new Estudiante();
        model.addAttribute("estudiante", estudiante);

        model.addAttribute("menuActivo", "estu");
        model.addAttribute("itemActivo", "estu_nuevo");
        return "estudiante/nuevoEstudiante";
    }

    @RequestMapping("/guardar")
    public String guardar(Estudiante estudiante) {
        estudianteService.guardarEstudiante(estudiante);
        return "redirect:/estudiante/nuevoEstudiante";
    }
}
