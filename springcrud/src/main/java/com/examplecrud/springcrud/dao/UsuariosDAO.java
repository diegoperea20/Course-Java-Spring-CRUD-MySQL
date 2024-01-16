package com.examplecrud.springcrud.dao;

import com.examplecrud.springcrud.domain.Usuarios;

import org.springframework.data.repository.CrudRepository;

public interface UsuariosDAO extends CrudRepository<Usuarios, String> {
    
   
    
}
