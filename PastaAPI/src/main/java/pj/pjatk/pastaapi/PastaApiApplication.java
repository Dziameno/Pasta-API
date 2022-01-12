package pj.pjatk.pastaapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class PastaApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(PastaApiApplication.class, args);
    }

    @GetMapping
    public String hello() {
        return "hello";
    }
}
