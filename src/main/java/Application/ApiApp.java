package Application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ApiApp {
    public static void main(String[] args) {
        SpringApplication.run(ApiApp.class,args);
    }
    @GetMapping("/")
    public String sayHi()
    {
        return "Hello";
    }
}
