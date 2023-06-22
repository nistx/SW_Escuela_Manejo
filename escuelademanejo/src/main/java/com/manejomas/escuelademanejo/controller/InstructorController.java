package com.manejomas.escuelademanejo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.manejomas.escuelademanejo.model.entidad.Instructor;
import com.manejomas.escuelademanejo.model.service.IInstructorService;

@Controller
@RequestMapping("/instructor")
public class InstructorController {

    @Autowired
    private IInstructorService instructorService;
    Instructor instructor = new Instructor();

    @RequestMapping("/listaInstructor")
    public String intructores(Model model) {
        model.addAttribute("menuActivo", "inst");
        model.addAttribute("itemActivo", "inst_lista");

        model.addAttribute("instructor", instructor);
        model.addAttribute("listaInstructores", instructorService.mostrarInstructor());
        return "instructor/listaInstructor";
    }

    @RequestMapping(value = "/guardar", method = RequestMethod.POST)
    public String guardar(Instructor instructor) {
        instructorService.guardarInstructor(instructor);
        return "redirect:/instructor/listaInstructor";
    }

    @RequestMapping("/eliminar/{id}")
    public String eliminar(@PathVariable(value = "id") Long id, Model model) {
        instructorService.eliminarInstructor(id);
        return "redirect:/instructor/listaInstructor";

    }

    @RequestMapping("/nuevoInstructor")
    public String nuevoInstructor(Model model) {
        model.addAttribute("menuActivo", "inst");
        model.addAttribute("itemActivo", "inst_nuevo");

        model.addAttribute("instructor", instructor);
        return "instructor/nuevoInstructor";
    }
}
