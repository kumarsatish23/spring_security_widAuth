package in.skr.spring_auth_security;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
    @GetMapping("/")
    public String welcome(){
        return "welcome to MyHome";
    }
}