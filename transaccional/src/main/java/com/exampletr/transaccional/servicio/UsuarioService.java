package com.exampletr.transaccional.servicio;

import java.util.*;

import com.exampletr.transaccional.domain.Usuarios;

public interface UsuarioService {

    //Metodos
    public List<Usuarios> listarUsuarios();

    public void guardar(Usuarios usuarios);

    public void eliminar(Usuarios usuarios);

    public Usuarios encontrarUsuario(Usuarios usuarios);
} 
