package com.example.application.endpoints.helloworld;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({HelloWorldEndpoint.class})
public class BrowserCallablesConfig {
}
