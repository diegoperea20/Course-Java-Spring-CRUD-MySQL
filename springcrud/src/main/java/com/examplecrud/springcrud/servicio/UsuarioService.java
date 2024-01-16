package com.examplecrud.springcrud.servicio;

import java.util.*;

import com.examplecrud.springcrud.domain.Usuarios;

public interface UsuarioService {

    //Metodos
    public List<Usuarios> listarUsuarios();

    public void guardar(Usuarios usuarios);

    public void eliminar(Usuarios usuarios);

    public Usuarios encontrarUsuario(Usuarios usuarios);

    

} 
