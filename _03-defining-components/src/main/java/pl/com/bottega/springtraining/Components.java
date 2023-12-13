package pl.com.bottega.springtraining;

import lombok.extern.java.Log;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Component
@Log
class Foo {

    Foo() {
        log.info("Creating");
    }

}

@Service
@Log
class Bar {
    Bar() {
        log.info("Creating");
    }
}

@Repository
@Log
class Baz {
    Baz() {
        log.info("Creating");
    }

    private String foo;

    class Y {

    }

    void doIt() {
        new Y();
    }

    @Component
    static class X {
        X() {
            log.info("Creating X");
        }
    }
}
