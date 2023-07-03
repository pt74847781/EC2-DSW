package EC2DSW.EC2DSW;


import java.lang.String;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

@RestController 
@RequestMapping(path="/")
public class Controller{
    @GetMapping(path= "/")
    public String home(){
        return "PT74847781 - Ariel Nuñez Cruz ";
    }
}