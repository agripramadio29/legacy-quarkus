package org.ehprods.endpoints;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.ehprods.engines.SystemdEngine;
import org.ehprods.utils.AppData;

@Path("/postgresql")
public class PostgreSQL {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/restart")
    public int restartPostgreSQL(){
        return SystemdEngine.systemdEngine("restart", AppData.POSTGRESQL_SERVICE_NAME);

    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/start")
    public int startPostgreSQL(){
        return SystemdEngine.systemdEngine("start", AppData.POSTGRESQL_SERVICE_NAME);

    }
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/stop")
    public int stopPostgreSQL(){
        return SystemdEngine.systemdEngine("stop", AppData.POSTGRESQL_SERVICE_NAME);

    }


}
