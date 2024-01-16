package com.examplecrud.springcrud.controller;

import java.util.ArrayList;
import java.util.Arrays;
import lombok.extern.slf4j.Slf4j;


import com.examplecrud.springcrud.domain.Usuarios;
import com.examplecrud.springcrud.servicio.UsuarioService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;



@Controller
@Slf4j
public class ControladorInicio {
    
    @Autowired
    private UsuarioService usuariosService;
    

    @GetMapping("/")
    public String inicio(Model model){
        var usuarios = usuariosService.listarUsuarios();
        log.info("ejecutando el controlador Spring MVC");
        model.addAttribute("usuarios", usuarios);
        return "index";
    }

     @GetMapping("/agregar")
    public String agregar(Usuarios usuarios){
        return "modificar";
        
    }

    @PostMapping("/guardar")
    public String guardar(Usuarios usuarios){
        usuariosService.guardar(usuarios);
        return "redirect:/";
    }


    @GetMapping("/editar/{user}")
    public String editar(Usuarios usuarios, Model model){
        usuarios = usuariosService.encontrarUsuario(usuarios);
        model.addAttribute("usuarios", usuarios);
        return "modificar";
    }

     @GetMapping("/eliminar/{user}")
    public String eliminar(Usuarios usuarios, Model model){
        usuariosService.eliminar( usuarios);
        return "redirect:/";
    }
}
