package org.ehprods.endpoints;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;



@Path("/")
public class HealthCheck {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public int healthCheck() {
        return 1;
    }

}
