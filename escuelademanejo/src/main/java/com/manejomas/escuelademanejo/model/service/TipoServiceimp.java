package com.manejomas.escuelademanejo.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manejomas.escuelademanejo.model.dao.ITipoDAO;
import com.manejomas.escuelademanejo.model.entidad.Tipo;

@Service
public class TipoServiceimp implements ITipoService {
    @Autowired
    private ITipoDAO tipoDAO;

    @Override
    public List<Tipo> mostrarTipo() {
        return (List<Tipo>) tipoDAO.findAll();
    }

    @Override
    public List<Tipo> mostrarTipoNombre() {
        return tipoDAO.mostrarTipoNombre();
    }

}
