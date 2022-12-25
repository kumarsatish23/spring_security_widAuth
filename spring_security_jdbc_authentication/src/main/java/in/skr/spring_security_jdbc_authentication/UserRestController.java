package in.skr.spring_security_jdbc_authentication;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserRestController {
    @GetMapping("/")
    public String welcome(){
        return "<h2>Welcome To Ashok IT : <h2>";
    }
    @GetMapping("/admin")
    public String adminProcess(){
        return "<h2>Welcome Admin : <h2>";
    }
    @GetMapping("/user")
    public String userProcess(){
        return "<h2>Welcome User : <h2>";
    }
}
