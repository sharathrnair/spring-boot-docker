package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {

    @RequestMapping("/")
    public String home() {
        return "<h1>Hello Docker World: demo to SGX, v1.1.0</h1>";
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
