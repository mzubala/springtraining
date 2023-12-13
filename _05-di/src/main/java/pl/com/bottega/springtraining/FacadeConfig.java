package pl.com.bottega.springtraining;

import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Log
class FacadeConfig {

    @Bean
    Service xyz(FacadeImpl facadeImpl) {
        return new ServiceImpl(facadeImpl);
    }

    @Bean
    Service uvw(@Qualifier("facadeImpl") Facade facade) {
        return new ServiceAnotherImpl(facade);
    }

    @Bean
    Service czesiek(ClientImpl clientImpl) {
        log.info("Zbyszek");
        return new ServiceImpl(janusz(clientImpl));
    }

    @Bean
    Service zbyszek(ClientImpl clientImpl) {
        log.info("Czesiek");
        return new ServiceImpl(janusz(clientImpl));
    }

    @Bean
    FacadeImpl janusz(ClientImpl baz1) {
        log.info("Janusz");
        return new FacadeImpl(baz1);
    }

}
