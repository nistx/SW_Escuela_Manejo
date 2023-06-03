package com.manejomas.escuelademanejo.model.service;

import java.util.List;

import com.manejomas.escuelademanejo.model.entidad.Estudiante;

public interface IEstudianteService {
    public void guardarEstudiante(Estudiante estudiante);

    public List<Estudiante> mostrarEstudiante();
}
