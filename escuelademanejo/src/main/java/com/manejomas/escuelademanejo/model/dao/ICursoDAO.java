package com.manejomas.escuelademanejo.model.dao;

import org.springframework.data.repository.CrudRepository;

import com.manejomas.escuelademanejo.model.entidad.Curso;

public interface ICursoDAO extends CrudRepository<Curso, Long> {

}
