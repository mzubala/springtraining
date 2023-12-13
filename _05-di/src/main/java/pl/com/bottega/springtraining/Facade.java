package pl.com.bottega.springtraining;

import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.stereotype.Component;

interface Facade {
}

@RequiredArgsConstructor
@Component
class FacadeImpl implements Facade {
    private final ClientImpl baz;
}

@Component
@Log
class FacadeOtherImpl implements Facade {
    private final Client client;

    public FacadeOtherImpl(Client clientAnotherImpl) {
        this.client = clientAnotherImpl;
        log.info("Creating with " + client.getClass());
    }
}
