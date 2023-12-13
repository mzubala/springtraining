package pl.com.bottega.springtraining;

import lombok.RequiredArgsConstructor;

interface Service {
}

@RequiredArgsConstructor
class ServiceImpl implements Service {
    private final FacadeImpl bar1;
}

@RequiredArgsConstructor
class ServiceAnotherImpl implements Service {
    private final Facade facade;
}
