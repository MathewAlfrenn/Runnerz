package dev.Mathew.Runnerz;

import org.springframework.stereotype.Component;

@Component
public class WelcomeMessage {
    public String getMessage() {
        return "Hello World";
    }
}
