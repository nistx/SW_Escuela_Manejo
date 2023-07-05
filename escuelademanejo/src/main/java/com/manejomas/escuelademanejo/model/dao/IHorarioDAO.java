package com.manejomas.escuelademanejo.model.dao;

import org.springframework.data.repository.CrudRepository;

import com.manejomas.escuelademanejo.model.entidad.Horario;

public interface IHorarioDAO extends CrudRepository<Horario, Long> {

}
