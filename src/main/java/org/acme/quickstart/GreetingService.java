package org.acme.quickstart;

import javax.enterprise.context.ApplicationScoped;

/**
 * GrettingService
 */
@ApplicationScoped
public class GreetingService {

    public String gretting(String visitorName){
        return "Hello " + visitorName;
    }
}