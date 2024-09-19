package org.ehprods.endpoints;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.ehprods.engines.SystemdEngine;
import org.ehprods.utils.AppData;


@Path("/docker")
public class Docker {

    @GET
    @Path("/start")
    @Produces(MediaType.APPLICATION_JSON)
    public int startDocker() {
       return SystemdEngine.systemdEngine("start", AppData.DOCKER_SERVICE_NAME);
    }

    @GET
    @Path("/stop")
    @Produces(MediaType.APPLICATION_JSON)
    public int stopDocker() {
       return SystemdEngine.systemdEngine("stop", AppData.DOCKER_SERVICE_NAME);
    }

    @GET
    @Path("/restart")
    @Produces(MediaType.APPLICATION_JSON)
    public int restartDocker() {
       return SystemdEngine.systemdEngine("restart", AppData.DOCKER_SERVICE_NAME);
    }
}
