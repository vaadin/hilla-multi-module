package com.example.application.endpoints.helloworld;

import com.vaadin.flow.server.auth.AnonymousAllowed;
import com.vaadin.hilla.BrowserCallable;
import org.jspecify.annotations.NonNull;

@BrowserCallable
@AnonymousAllowed
public class HelloWorldEndpoint {

    @NonNull
    public String sayHello(@NonNull String name) {
        if (name.isEmpty()) {
            return "Hello stranger";
        } else {
            return "Hello " + name;
        }
    }
}