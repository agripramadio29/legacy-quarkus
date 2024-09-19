package org.ehprods.endpoints;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.ehprods.engines.SystemdEngine;
import org.ehprods.utils.AppData;

@Path("/mysql")
public class MySQL {

    @GET
    @Path("/start")
    @Produces(MediaType.APPLICATION_JSON)
    public int startMySQL() {
       return SystemdEngine.systemdEngine("start", AppData.MYSQL_SERVICE_NAME);
    }

    @GET
    @Path("/stop")
    @Produces(MediaType.APPLICATION_JSON)
    public int stopMySQL() {
       return SystemdEngine.systemdEngine("stop", AppData.MYSQL_SERVICE_NAME);
    }
    @GET
    @Path("/restart")
    @Produces(MediaType.APPLICATION_JSON)
    public int restartMySQL() {
       return SystemdEngine.systemdEngine("restart", AppData.MYSQL_SERVICE_NAME);
    }


}
