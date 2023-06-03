package com.manejomas.escuelademanejo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.manejomas.escuelademanejo.model.entidad.Curso;
import com.manejomas.escuelademanejo.model.service.ICursoService;

@Controller
@RequestMapping("/curso")
public class CursoController {
    @Autowired
    private ICursoService cursoService;

    @RequestMapping("/listaCurso")
    public String estudiantes(Model model) {
        model.addAttribute("menuActivo", "cur");
        model.addAttribute("itemActivo", "cur_lista");

        // Listar Curso
        model.addAttribute("listaCursos", cursoService.mostrarCurso());
        return "curso/listaCurso";
    }

    @GetMapping("/nuevoCurso")
    public String nuevoCurso(Model model) {
        model.addAttribute("menuActivo", "cur");
        model.addAttribute("itemActivo", "cur_nuevo");

        // Guardar Curso
        Curso curso = new Curso();
        model.addAttribute("curso", curso);

        return "curso/nuevoCurso";
    }

    @PostMapping("/guardar")
    public String guardar(Curso curso) {
        cursoService.guardarCurso(curso);
        return "redirect:/curso/listaCurso";
    }

    @RequestMapping("/mostrarEditar/{id}")
    public String editar(@PathVariable(value = "id") Long id, Model model) {
        model.addAttribute("menuActivo", "cur");
        model.addAttribute("itemActivo", "cur_nuevo");

        model.addAttribute("SubItem", "Editar Curso");

        // Mostrar
        Curso curso = new Curso();
        curso = cursoService.buscarCurso(id);
        model.addAttribute("curso", curso);
        model.addAttribute("listaCursos", cursoService.mostrarCurso());
        return "curso/nuevoCurso";
    }

    @RequestMapping("/eliminar/{id}")
    public String eliminar(@PathVariable(value = "id") Long id) {
        cursoService.eliminarCurso(id);
        return "redirect:/curso/listaCurso";
    }

}
