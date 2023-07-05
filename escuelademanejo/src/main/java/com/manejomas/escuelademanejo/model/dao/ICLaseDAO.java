package com.manejomas.escuelademanejo.model.dao;

import org.springframework.data.repository.CrudRepository;

import com.manejomas.escuelademanejo.model.entidad.Clase;

public interface ICLaseDAO extends CrudRepository<Clase, Long> {

}
