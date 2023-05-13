package com.manejomas.escuelademanejo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DashboardController {
    @RequestMapping("/Dashboard/Inicio")
    public String home() {
        return "inicio";
    }

    @RequestMapping("/Dashboard/ListaClase")
    public String clases() {
        return "listaClase";
    }

    @RequestMapping("/Dashboard/NuevaClase")
    public String nuevaClase() {
        return "nuevaClase";
    }

    @RequestMapping("/Dashboard/ListaEstudiante")
    public String estudiantes() {
        return "listaEstudiante";
    }

    @RequestMapping("/Dashboard/NuevoEstudiante")
    public String nuevoEstudiante() {
        return "nuevoEstudiante";
    }

    @RequestMapping("/Dashboard/ListaInstructor")
    public String intructores() {
        return "listaInstructor";
    }

    @RequestMapping("/Dashboard/NuevoInstructor")
    public String nuevoInstructor() {
        return "nuevoInstructor";
    }

    @RequestMapping("/Dashboard/Vehiculos")
    public String vehiculo() {
        return "vehiculos";
    }
}
