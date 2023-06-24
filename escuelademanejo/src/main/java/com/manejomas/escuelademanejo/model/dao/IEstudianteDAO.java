package com.manejomas.escuelademanejo.model.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.manejomas.escuelademanejo.model.entidad.Estudiante;

public interface IEstudianteDAO extends CrudRepository<Estudiante, Long> {
    public List<Estudiante> findByDni(String dni);
}
