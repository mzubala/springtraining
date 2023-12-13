package pl.com.bottega.springtraining;

import lombok.extern.java.Log;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@Log
class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

}
