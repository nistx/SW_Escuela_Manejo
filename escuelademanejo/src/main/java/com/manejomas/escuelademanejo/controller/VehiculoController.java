package com.manejomas.escuelademanejo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.manejomas.escuelademanejo.model.entidad.Vehiculo;
import com.manejomas.escuelademanejo.model.service.ITipoService;
import com.manejomas.escuelademanejo.model.service.IVehiculoService;

@Controller
@RequestMapping("/vehiculo")
public class VehiculoController {
    @Autowired
    private ITipoService tipoService;

    @Autowired
    private IVehiculoService vehiculoService;

    @RequestMapping("/")
    public String vehiculo(Model model) {
        Vehiculo vehiculo = new Vehiculo();
        model.addAttribute("vehiculo", vehiculo);
        model.addAttribute("menuActivo", "veh");
        model.addAttribute("listaTipos", tipoService.mostrarTipo());
        model.addAttribute("listaVehiculos", vehiculoService.mostrarVehiculo());
        return "vehiculo/vehiculos";
    }

    @PostMapping("/guardar")
    public String guardar(Vehiculo vehiculo) {
        vehiculoService.guardarVehiculo(vehiculo);
        return "redirect:/vehiculo/";
    }
}
