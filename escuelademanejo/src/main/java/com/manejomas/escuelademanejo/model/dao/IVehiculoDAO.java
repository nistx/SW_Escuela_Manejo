package com.manejomas.escuelademanejo.model.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.manejomas.escuelademanejo.model.entidad.Vehiculo;

public interface IVehiculoDAO extends CrudRepository<Vehiculo, Long> {
    @Query(value = "SELECT v.*,t.tipo_nom FROM VEHICULO V INNER JOIN TIPO T" +
            " ON V.tipo_id=T.tipo_id INNER JOIN MATRICULA M" +
            " ON T.tipo_id=M.tipo_id where m.matri_id= ?1", nativeQuery = true)
    public List<Vehiculo> listarVehiculo(String matriId);

}
