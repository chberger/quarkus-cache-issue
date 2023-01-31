package de.chberger.quarkus;

import io.quarkus.cache.CacheResult;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class CacheResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @CacheResult(cacheName = "test")
    public String hello() {
        return "Hello from RESTEasy Reactive";
    }
}