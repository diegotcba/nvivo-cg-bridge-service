package com.nvivo.cgbridge.svc.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * Created by DiegoT on 16/07/2016.
 */
@Path("/")
@Consumes("application/json")
@Produces("application/json")
public interface RestCgBridgeService {

    @GET
    @Path("/status/")
    @Produces("text/plain")
    public String getStatus();
}
