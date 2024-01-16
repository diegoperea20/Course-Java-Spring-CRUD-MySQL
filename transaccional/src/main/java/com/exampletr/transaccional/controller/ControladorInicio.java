package com.exampletr.transaccional.controller;

import java.util.ArrayList;
import java.util.Arrays;
import lombok.extern.slf4j.Slf4j;


import com.exampletr.transaccional.domain.Usuarios;
import com.exampletr.transaccional.servicio.UsuarioService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



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
}
