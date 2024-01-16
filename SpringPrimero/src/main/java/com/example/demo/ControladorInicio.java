package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

import java.util.*;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;

//importacion de clases
import com.example.domain.Persona;

@Controller
public class ControladorInicio {
    @Value("${index.saludo}")
    private String saludo;


    @GetMapping("/")
    public String inicio(Model model) {
        String mensaje="Hola";
        Persona persona = new Persona();
        persona.setNombre("Javier");
        persona.setApellido("Perez");
        persona.setEmail("qKp7U@example.com");
        persona.setTelefono("123456789");
        //model.addAttribute("persona",persona);

        Persona persona2 = new Persona();
        persona2.setNombre("Soni");
        persona2.setApellido("Martinez");
        persona2.setEmail("sinU@example.com");
        persona2.setTelefono("12345789");
      

        /* List<Persona> personas = new ArrayList<>();
        personas.add(persona);
        personas.add(persona2); */

        List<Persona> personas = Arrays.asList(persona,persona2);
        
        model.addAttribute("mensaje",mensaje);
        model.addAttribute("saludo",saludo);
        model.addAttribute("personas",personas);
        return "index";
    }

   
}
