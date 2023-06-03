package com.manejomas.escuelademanejo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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

        // Listar Estudiante
        model.addAttribute("listaEstudiantes", estudianteService.mostrarEstudiante());
        return "estudiante/listaEstudiante";
    }

    @GetMapping("/nuevoEstudiante")
    public String nuevoEstudiante(Model model) {
        model.addAttribute("menuActivo", "estu");
        model.addAttribute("itemActivo", "estu_nuevo");

        // Guardar Estudiante
        Estudiante estudiante = new Estudiante();
        model.addAttribute("estudiante", estudiante);

        return "estudiante/nuevoEstudiante";
    }

    @PostMapping("/guardar")
    public String guardar(Estudiante estudiante) {
        estudianteService.guardarEstudiante(estudiante);
        return "redirect:/estudiante/listaEstudiante";
    }
}
