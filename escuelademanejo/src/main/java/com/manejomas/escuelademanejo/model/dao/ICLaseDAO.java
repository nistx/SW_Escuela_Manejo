package com.manejomas.escuelademanejo.model.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.manejomas.escuelademanejo.model.entidad.Clase;

public interface ICLaseDAO extends CrudRepository<Clase, Long> {
    @Query(value = "SELECT * FROM CLASE"
            + " WHERE cla_fecha = CAST(GETDATE() AS DATE)", nativeQuery = true)
    public List<Clase> mostrarClaseHoy();
}
