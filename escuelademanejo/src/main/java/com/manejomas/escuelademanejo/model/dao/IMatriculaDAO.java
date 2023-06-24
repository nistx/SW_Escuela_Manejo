package com.manejomas.escuelademanejo.model.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.manejomas.escuelademanejo.model.entidad.Matricula;

public interface IMatriculaDAO extends CrudRepository<Matricula, Long> {
    @Query(value = "SELECT TOP 1 m.* , e.estu_dni, c.cur_nom, c.cur_num_clase"
            + " FROM matricula m INNER JOIN estudiante e on m.estu_id=e.estu_id"
            + " INNER JOIN curso c on m.cur_id=c.cur_id"
            + " WHERE e.estu_dni= ?1 ORDER BY matri_fecha DESC", nativeQuery = true)
    public Matricula buscarMatricula(String dni);

    @Query(value = "SELECT COUNT(*) FROM MATRICULA M JOIN CLASE C"
            + " ON M.matri_id=C.matri_id WHERE M.matri_id= ?1", nativeQuery = true)
    public String contarClasesRestantes(String matriId);
}
