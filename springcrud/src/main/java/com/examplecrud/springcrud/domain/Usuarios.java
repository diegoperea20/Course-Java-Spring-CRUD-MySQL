package com.examplecrud.springcrud.domain;

import java.io.Serializable;

import jakarta.persistence.*;
import lombok.Data;


@Data
@Entity
@Table(name = "usuarios")
public class Usuarios implements Serializable {

    
     @Id
     @Column(name = "user", nullable = false, unique = true )
     private String user;
     private String nombre;
     private String password;
     private int tipo;


     

     

}
