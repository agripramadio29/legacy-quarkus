package org.ehprods.endpoints;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.ehprods.engines.BashEngine;

@Path("/quarkus")
public class Quarkus {

    @GET
    @Path("/ibranch")
    @Produces(MediaType.APPLICATION_JSON)
    public int killProcess(){return BashEngine.PIDKiller("ibranch");
    }

}
