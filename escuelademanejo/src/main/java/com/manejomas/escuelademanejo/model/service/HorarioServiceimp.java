package com.manejomas.escuelademanejo.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manejomas.escuelademanejo.model.dao.IHorarioDAO;
import com.manejomas.escuelademanejo.model.entidad.Horario;

@Service
public class HorarioServiceimp implements IHorarioService {
    @Autowired
    private IHorarioDAO horarioDAO;

    @Override
    public List<Horario> mostrarHorario() {
        return (List<Horario>) horarioDAO.findAll();
    }

}
