package pl.com.bottega.springtraining;

import org.springframework.stereotype.Component;

interface Client {
}

@Component("misiek")
class ClientImpl implements Client {

}

@Component
class ClientAnotherImpl implements Client {

}
