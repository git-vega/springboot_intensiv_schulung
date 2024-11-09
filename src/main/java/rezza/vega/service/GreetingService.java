package rezza.vega.service;

import org.springframework.stereotype.Service;

/*
Die GreetingService Klasse ist ein einfacher Service, der eine Begrüßungsnachricht zurückgibt.
 */
@Service
public class GreetingService {
    public String greet() {
        return "Hola Miguel!";
    }
}
