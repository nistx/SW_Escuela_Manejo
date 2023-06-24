package com.manejomas.escuelademanejo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.manejomas.escuelademanejo.model.entidad.Clase;
import com.manejomas.escuelademanejo.model.entidad.Matricula;
import com.manejomas.escuelademanejo.model.service.IEstudianteService;
import com.manejomas.escuelademanejo.model.service.IInstructorService;
import com.manejomas.escuelademanejo.model.service.IMatriculaService;

@Controller
@RequestMapping("/clase")
public class ClaseController {

    @Autowired
    private IEstudianteService estudianteService;

    @Autowired
    private IInstructorService instructorService;

    @Autowired
    private IMatriculaService matriculaService;

    @RequestMapping("/listaClase")
    public String clases(Model model) {
        model.addAttribute("menuActivo", "clase");
        model.addAttribute("itemActivo", "clase_lista");
        return "clase/listaClase";
    }

    @RequestMapping("/nuevaClase")
    public String nuevaClase(Model model, @Param("dni") String dni) {
        model.addAttribute("menuActivo", "clase");
        model.addAttribute("itemActivo", "clase_nueva");

        Clase clase = new Clase();
        model.addAttribute("clase", clase);

        // buscar por dni
        model.addAttribute("estudiante", estudianteService.buscarEstudianteDNI(dni));
        model.addAttribute("dni", dni);

        Matricula matricula = matriculaService.buscarMatricula(dni);

        model.addAttribute("matricula", matriculaService.buscarMatricula(dni));

        String matriculaID;
        if (matricula == null) {
            matriculaID = "0";
        } else {
            matriculaID = matricula.getId().toString();
        }
        model.addAttribute("numClasesRestantes", matriculaService.contarClasesRestantes(matriculaID));

        model.addAttribute("listaInstructor", instructorService.mostrarInstructor());

        return "clase/nuevaClase";
    }
}
