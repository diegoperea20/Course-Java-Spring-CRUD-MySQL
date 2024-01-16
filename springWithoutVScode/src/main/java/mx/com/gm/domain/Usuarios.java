package mx.com.gm.domain;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;


@Data
@Entity
@Table(name = "usuarios")
public class Usuarios implements Serializable {

    
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     private String user;
     private String nombre;
     private String password;
     private int tipo;


     

     

}
