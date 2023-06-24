package com.manejomas.escuelademanejo.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manejomas.escuelademanejo.model.dao.IMatriculaDAO;
import com.manejomas.escuelademanejo.model.entidad.Matricula;

@Service
public class MatriculaServiceimp implements IMatriculaService {
    @Autowired
    private IMatriculaDAO matriculaDAO;

    @Override
    public void guardarMatricula(Matricula matricula) {
        if (matricula.getEsRecogido() == null) {
            matricula.setEsRecogido("0");
        }
        matriculaDAO.save(matricula);
    }

    @Override
    public Matricula buscarMatricula(String dni) {
        return matriculaDAO.buscarMatricula(dni);
    }

    @Override
    public String contarClasesRestantes(String matriId) {
        return matriculaDAO.contarClasesRestantes(matriId);
    }
}
