package com.manejomas.escuelademanejo.model.dao;

import org.springframework.data.repository.CrudRepository;

import com.manejomas.escuelademanejo.model.entidad.Vehiculo;

public interface IVehiculoDAO extends CrudRepository<Vehiculo, Long> {

}
