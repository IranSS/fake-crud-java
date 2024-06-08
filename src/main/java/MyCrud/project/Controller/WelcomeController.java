package MyCrud.project.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
    @GetMapping("/welcome")
    public String Welcome(){
        return "Bem vindo a minha aplicação Spring Boot Rest API - By IranSS";
    }
}
