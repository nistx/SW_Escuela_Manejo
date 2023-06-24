package com.manejomas.escuelademanejo.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manejomas.escuelademanejo.model.dao.IEstudianteDAO;
import com.manejomas.escuelademanejo.model.entidad.Estudiante;

@Service
public class EstudianteServiceimp implements IEstudianteService {
    @Autowired
    private IEstudianteDAO estudianteDAO;

    @Override
    public void guardarEstudiante(Estudiante estudiante) {
        estudianteDAO.save(estudiante);
    }

    @Override
    public List<Estudiante> mostrarEstudiante() {
        return (List<Estudiante>) estudianteDAO.findAll();
    };

    @Override
    public Estudiante buscarEstudiante(Long id) {
        return estudianteDAO.findById(id).orElse(null);
    }

    @Override
    public List<Estudiante> buscarEstudianteDNI(String dni) {
        return estudianteDAO.findByDni(dni);
    }

    @Override
    public void eliminarEstudiante(Long id) {
        estudianteDAO.deleteById(id);
    }

}
