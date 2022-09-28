package com.example.application.endpoints.helloworld

import com.vaadin.flow.server.auth.AnonymousAllowed
import dev.hilla.Endpoint

@Endpoint
@AnonymousAllowed
class HelloWorldEndpoint {
    fun sayHello(name: String): String {
        return if (name.isEmpty()) {
            "Hello stranger from Kotlin"
        } else {
            "Hello $name from Kotlin"
        }
    }
}
