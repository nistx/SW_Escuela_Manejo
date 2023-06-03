package com.manejomas.escuelademanejo.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manejomas.escuelademanejo.model.dao.ICursoDAO;
import com.manejomas.escuelademanejo.model.entidad.Curso;

@Service
public class CursoServiceimp implements ICursoService {
    @Autowired
    private ICursoDAO cursoDAO;

    @Override
    public void guardarCurso(Curso curso) {
        cursoDAO.save(curso);
    }

    @Override
    public List<Curso> mostrarCurso() {
        return (List<Curso>) cursoDAO.findAll();
    }

    @Override
    public Curso buscarCurso(Long id) {
        return cursoDAO.findById(id).orElse(null);
    }

    @Override
    public void eliminarCurso(Long id) {
        cursoDAO.deleteById(id);
    }

}
