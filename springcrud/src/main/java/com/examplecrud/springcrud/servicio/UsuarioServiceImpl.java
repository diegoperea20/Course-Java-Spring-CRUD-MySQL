package com.examplecrud.springcrud.servicio;


import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.examplecrud.springcrud.dao.UsuariosDAO;
import com.examplecrud.springcrud.domain.Usuarios;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    private UsuariosDAO usuariosDAO;
    //Metodos
    @Override
    @Transactional(readOnly = true)
    public List<Usuarios> listarUsuarios() {
       return (List<Usuarios>) usuariosDAO.findAll();
    }

    @Override
    @Transactional
    public void guardar(Usuarios usuarios) {
        usuariosDAO.save(usuarios);
    }

    @Override
    @Transactional
    public void eliminar(Usuarios usuarios) {
        usuariosDAO.delete(usuarios);
    }

    @Override
    @Transactional(readOnly = true)
    public Usuarios encontrarUsuario(Usuarios usuarios) {
        return usuariosDAO.findById(usuarios.getUser()).orElse(null);
    }

   

}
