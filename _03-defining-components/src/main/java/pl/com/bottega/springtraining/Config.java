package pl.com.bottega.springtraining;

import lombok.extern.java.Log;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Log
class Config {

    Config() {
        log.info("Creating");
    }

    @Bean
    Some some() {
        log.info("Creating Some");
        return new Some();
    }

    @Bean
    Other other() {
        log.info("Creating other");
        return new Other();
    }

}
