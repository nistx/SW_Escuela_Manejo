package com.manejomas.escuelademanejo.model.service;

import com.manejomas.escuelademanejo.model.entidad.Matricula;

public interface IMatriculaService {
    public void guardarMatricula(Matricula matricula);

    public Matricula buscarMatricula(String dni);

    public String contarClasesRestantes(String matriId);
}
