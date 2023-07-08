package com.manejomas.escuelademanejo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.manejomas.escuelademanejo.model.entidad.Usuario;
import com.manejomas.escuelademanejo.model.service.IRolService;
import com.manejomas.escuelademanejo.model.service.IUsuarioService;

@Controller
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    private IUsuarioService usuarioService;

    @Autowired
    private IRolService rolService;

    @RequestMapping("/")
    public String home(Model model) {
        model.addAttribute("menuActivo", "ini");

        Usuario usuario = new Usuario();
        model.addAttribute("usuario", usuario);
        model.addAttribute("listaRoles", rolService.mostrarRoles());
        model.addAttribute("listaUsuarios", usuarioService.mostrarUsuarios());
        return "usuario";
    }

    @RequestMapping("/guardar")
    public String guardar(Usuario usuario) {
        usuarioService.guardar(usuario);
        return "redirect:/usuario/";
    }
}
