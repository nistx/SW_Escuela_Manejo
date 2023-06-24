package com.manejomas.escuelademanejo.model.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.manejomas.escuelademanejo.model.entidad.Tipo;

public interface ITipoDAO extends CrudRepository<Tipo, Long> {
    @Query(value = "SELECT TIPO_NOM FROM TIPO GROUP BY TIPO_NOM", nativeQuery = true)
    public List<Tipo> mostrarTipoNombre();
}
