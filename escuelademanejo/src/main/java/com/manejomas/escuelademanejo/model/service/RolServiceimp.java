package com.manejomas.escuelademanejo.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manejomas.escuelademanejo.model.dao.IRolDAO;
import com.manejomas.escuelademanejo.model.entidad.Rol;

@Service
public class RolServiceimp implements IRolService {

    @Autowired
    private IRolDAO rolDAO;

    @Autowired
    public List<Rol> mostrarRoles() {
        return (List<Rol>) rolDAO.findAll();
    }
}
