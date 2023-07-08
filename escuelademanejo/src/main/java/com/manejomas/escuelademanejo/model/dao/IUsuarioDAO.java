package com.manejomas.escuelademanejo.model.dao;

import org.springframework.data.repository.CrudRepository;

import com.manejomas.escuelademanejo.model.entidad.Usuario;

public interface IUsuarioDAO extends CrudRepository<Usuario, Long> {
    public Usuario findByUsername(String username);
}
