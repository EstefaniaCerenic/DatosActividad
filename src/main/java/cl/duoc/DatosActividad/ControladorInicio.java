
package cl.duoc.DatosActividad;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import cl.duoc.DatosActividad.domain.Cliente;

@Controller
@Slf4j
public class ControladorInicio {
    
    
     
      @GetMapping("/")
    public String inicio(Model modelo){
        
        
        String mensaje = "Empresa Limitada";
        
        modelo.addAttribute("mensaje",mensaje);
       
        
        Cliente c=new Cliente();
        c.setNombre("Estefania");
        c.setApellido("Cerenic");
        c.setEmail("estefania@gmail.com");
        c.setDireccion("Los Agapantos #96");
        c.setEdad(31);
        
        
        modelo.addAttribute("c",c);
        
        
        return "index";
       
    }
}
    

