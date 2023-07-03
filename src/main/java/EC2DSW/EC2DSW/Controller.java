package EC2DSW.EC2DSW;


import java.lang.String;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping(path="/") //link principal padre
public class Controller{
    
        @GetMapping(path="/") 
        public String home(){
            return "PT74847781 - Ariel Nuñez Cruz";
        }
        @GetMapping(path="/idat/codigo") 
        public String codigo(){
            return "PT74847781";
        }
        @GetMapping(path="/idat/nombre-completo") 
        public String nombrecompleto(){
            return "Ariel Nuñez Cruz";
        }
}