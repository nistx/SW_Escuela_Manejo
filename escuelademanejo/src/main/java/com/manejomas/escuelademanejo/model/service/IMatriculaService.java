package com.manejomas.escuelademanejo.model.service;

import java.util.List;

import com.manejomas.escuelademanejo.model.entidad.Matricula;

public interface IMatriculaService {
    public void guardarMatricula(Matricula matricula);

    public Matricula buscarMatricula(String dni);

    public String contarClasesRestantes(String matriId);

    public List<Matricula> mostrarMatricula();
}
