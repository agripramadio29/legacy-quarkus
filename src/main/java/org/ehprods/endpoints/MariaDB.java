package org.ehprods.endpoints;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.ehprods.engines.SystemdEngine;
import org.ehprods.utils.AppData;

@Path("/mariadb")
public class MariaDB {

    @GET
    @Path("/start")
    @Produces(MediaType.APPLICATION_JSON)
    public int startMariaDB() {
        return SystemdEngine.systemdEngine("start", AppData.MARIADB_SERVICE_NAME);
    }

    @GET
    @Path("/stop")
    @Produces(MediaType.APPLICATION_JSON)
    public int stopMariaDB() {
        return SystemdEngine.systemdEngine("stop", AppData.MARIADB_SERVICE_NAME);
    }

    @GET
    @Path("/restart")
    @Produces(MediaType.APPLICATION_JSON)
    public int restartMariaDB() {
        return SystemdEngine.systemdEngine("restart", AppData.MARIADB_SERVICE_NAME);
    }
}
