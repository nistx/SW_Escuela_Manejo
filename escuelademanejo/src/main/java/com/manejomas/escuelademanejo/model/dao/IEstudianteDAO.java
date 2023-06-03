package com.manejomas.escuelademanejo.model.dao;

import org.springframework.data.repository.CrudRepository;

import com.manejomas.escuelademanejo.model.entidad.Estudiante;

public interface IEstudianteDAO extends CrudRepository<Estudiante, Long> {

}
