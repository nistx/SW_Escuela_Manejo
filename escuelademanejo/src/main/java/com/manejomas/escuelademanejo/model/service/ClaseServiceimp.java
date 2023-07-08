package com.manejomas.escuelademanejo.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manejomas.escuelademanejo.model.dao.ICLaseDAO;
import com.manejomas.escuelademanejo.model.entidad.Clase;

@Service
public class ClaseServiceimp implements IClaseService {
    @Autowired
    private ICLaseDAO claseDAO;

    @Override
    public void guardarClase(Clase clase) {

        claseDAO.save(clase);
    }

    @Override
    public List<Clase> mostrarClase() {
        return (List<Clase>) claseDAO.findAll();
    }

    @Override
    public List<Clase> mostrarClaseHoy() {
        return (List<Clase>) claseDAO.mostrarClaseHoy();
    }
}
