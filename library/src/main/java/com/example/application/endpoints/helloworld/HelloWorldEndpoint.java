package com.example.application.endpoints.helloworld;

import com.example.application.annotations.NeverNull;
import com.vaadin.flow.server.auth.AnonymousAllowed;
import dev.hilla.Endpoint;

@Endpoint
@AnonymousAllowed
public class HelloWorldEndpoint {

    @NeverNull
    public String sayHello(@NeverNull String name) {
        if (name.isEmpty()) {
            return "Hello stranger";
        } else {
            return "Hello " + name;
        }
    }
}