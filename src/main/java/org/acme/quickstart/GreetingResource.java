package org.acme.quickstart;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.jboss.resteasy.annotations.jaxrs.PathParam;
import org.reactivestreams.Publisher;

@Path("/hello")
public class GreetingResource {

    @Inject
    GreetingService greetingService;

    @Inject
    StreamCounter streamCounter;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/greeting/{name}")
    public String hello(@PathParam("name") String name) {
        return greetingService.gretting(name);
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "hello from quarkus!";
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/async")
    public CompletionStage<String> asyncHello() {
        // CompletableFuture<String> completableFuture = new CompletableFuture<>();

        // System.out.println("Dispatching a job...");
        // Executors.newCachedThreadPool().submit(() -> {
        //     try {
        //         System.out.println("Sleeping for 10s...");
        //         Thread.sleep(10000);
        //     } catch (InterruptedException e) {
        //         e.printStackTrace();
        //     }
        //     completableFuture.complete("after 10s... Hello");

        //     return null;
        // });

        return CompletableFuture.supplyAsync(() -> {
            return "done!";
        });
    }

    @GET
    @Produces(MediaType.SERVER_SENT_EVENTS)
    @Path("/counter")
    public Publisher<String> counter() {

        return streamCounter.counter();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/demo")
    public Demo demo() { 
        return new Demo("Quarkus Demo", "Quarkus", "Recife", "EMPREL");
    }    
}