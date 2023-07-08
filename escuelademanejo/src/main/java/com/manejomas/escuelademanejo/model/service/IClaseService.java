package com.manejomas.escuelademanejo.model.service;

import java.util.List;

import com.manejomas.escuelademanejo.model.entidad.Clase;

public interface IClaseService {
    public void guardarClase(Clase clase);

    public List<Clase> mostrarClase();

    public List<Clase> mostrarClaseHoy();
}
