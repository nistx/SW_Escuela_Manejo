package com.manejomas.escuelademanejo.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.manejomas.escuelademanejo.model.dao.IUsuarioDAO;
import com.manejomas.escuelademanejo.model.entidad.Usuario;

@Service
public class UsuarioServiceimp implements IUsuarioService {

    @Autowired
    private IUsuarioDAO usuarioDAO;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    @Override
    public void guardar(Usuario usuario) {
        String passwordCodificado = passwordEncoder.encode(usuario.getPassword());
        usuario.setPassword(passwordCodificado);
        usuarioDAO.save(usuario);
    }

    @Override
    public List<Usuario> mostrarUsuarios() {
        return (List<Usuario>) usuarioDAO.findAll();
    }

}
