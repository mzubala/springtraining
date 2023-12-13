package pl.com.bottega.springtraining;

import lombok.extern.java.Log;
import org.springframework.boot.CommandLineRunner;

@Log
class Other implements CommandLineRunner {

    public Other() {
        log.info("Creating");
    }

    @Override
    public void run(String... args) throws Exception {
        log.info("Running");
    }
}
