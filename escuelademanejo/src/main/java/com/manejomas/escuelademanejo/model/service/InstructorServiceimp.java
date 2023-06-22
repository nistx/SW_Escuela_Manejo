package com.manejomas.escuelademanejo.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manejomas.escuelademanejo.model.dao.IInstructorDAO;
import com.manejomas.escuelademanejo.model.entidad.Instructor;

@Service
public class InstructorServiceimp implements IInstructorService {
    @Autowired
    private IInstructorDAO instructorDAO;

    @Override
    public void guardarInstructor(Instructor instructor) {
        instructorDAO.save(instructor);
    }

    @Override
    public List<Instructor> mostrarInstructor() {
        return (List<Instructor>) instructorDAO.findAll();
    }

    @Override
    public void eliminarInstructor(Long id) {
        instructorDAO.deleteById(id);
    }
}
