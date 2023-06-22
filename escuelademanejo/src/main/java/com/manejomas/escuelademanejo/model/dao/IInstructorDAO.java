package com.manejomas.escuelademanejo.model.dao;

import org.springframework.data.repository.CrudRepository;

import com.manejomas.escuelademanejo.model.entidad.Instructor;

public interface IInstructorDAO extends CrudRepository<Instructor, Long> {

}
