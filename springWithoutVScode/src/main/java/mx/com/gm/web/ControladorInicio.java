package mx.com.gm.web;

import java.util.ArrayList;
import java.util.Arrays;
import lombok.extern.slf4j.Slf4j;
import mx.com.gm.dao.UsuariosDAO;
import mx.com.gm.domain.Usuarios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class ControladorInicio {
    
    @Autowired
    private UsuariosDAO usuariosDAO;
    
    @GetMapping("/")
    public String inicio(Model model){
        var usuarios = usuariosDAO.findAll();
        log.info("ejecutando el controlador Spring MVC");
        model.addAttribute("usuarios", usuarios);
        return "index";
    }
}
