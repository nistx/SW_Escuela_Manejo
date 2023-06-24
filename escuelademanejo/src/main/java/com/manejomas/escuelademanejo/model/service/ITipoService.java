package com.manejomas.escuelademanejo.model.service;

import java.util.List;

import com.manejomas.escuelademanejo.model.entidad.Tipo;

public interface ITipoService {
    public List<Tipo> mostrarTipo();

    public List<Tipo> mostrarTipoNombre();
}
