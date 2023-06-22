package com.manejomas.escuelademanejo.model.service;

import java.util.List;

import com.manejomas.escuelademanejo.model.entidad.Instructor;

public interface IInstructorService {
    public void guardarInstructor(Instructor instructor);

    public List<Instructor> mostrarInstructor();

    public void eliminarInstructor(Long id);

}
