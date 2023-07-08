package com.manejomas.escuelademanejo.model.service;

import java.util.List;

import com.manejomas.escuelademanejo.model.entidad.Usuario;

public interface IUsuarioService {
    public void guardar(Usuario usuario);

    public List<Usuario> mostrarUsuarios();
}
