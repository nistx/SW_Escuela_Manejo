package com.manejomas.escuelademanejo.model.service;

import java.util.List;

import com.manejomas.escuelademanejo.model.entidad.Curso;

public interface ICursoService {

    public void guardarCurso(Curso curso);

    public List<Curso> mostrarCurso();

    public Curso buscarCurso(Long id);

    public void eliminarCurso(Long id);

}
