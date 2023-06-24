package com.manejomas.escuelademanejo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.manejomas.escuelademanejo.model.entidad.Matricula;
import com.manejomas.escuelademanejo.model.service.ICursoService;
import com.manejomas.escuelademanejo.model.service.IEstudianteService;
import com.manejomas.escuelademanejo.model.service.IMatriculaService;
import com.manejomas.escuelademanejo.model.service.ITipoService;

@Controller
@RequestMapping("/matricula")
public class MatriculaController {
    @Autowired
    private ICursoService cursoService;

    @Autowired
    private ITipoService tipoService;

    @Autowired
    private IEstudianteService estudianteService;

    @Autowired
    private IMatriculaService matriculaService;

    @RequestMapping("/")
    public String matricula(Model model, @Param("dni") String dni) {
        model.addAttribute("menuActivo", "matri");

        Matricula matricula = new Matricula();
        model.addAttribute("matricula", matricula);

        model.addAttribute("listaCursos", cursoService.mostrarCurso());
        model.addAttribute("listaTipos", tipoService.mostrarTipo());

        // buscar por dni
        model.addAttribute("estudiante", estudianteService.buscarEstudianteDNI(dni));
        model.addAttribute("dni", dni);

        return "matricula/matricula";
    }

    @RequestMapping(value = "/guardar", method = RequestMethod.POST)
    public String guardar(Matricula matricula) {
        matriculaService.guardarMatricula(matricula);
        return "redirect:/matricula/";
    }
}
