package org.ehprods.endpoints;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.ehprods.engines.SystemdEngine;
import org.ehprods.utils.AppData;

@Path("/containerd")
public class Containerd {

    @GET
    @Path("/start")
    @Produces(MediaType.APPLICATION_JSON)
    public int startContainerd() {
        return SystemdEngine.systemdEngine("start", AppData.CONTAINERD_SERVICE_NAME);
    }

    @GET
    @Path("/stop")
    @Produces(MediaType.APPLICATION_JSON)
    public int stopContainerd() {
        return SystemdEngine.systemdEngine("stop", AppData.CONTAINERD_SERVICE_NAME);
    }

    @GET
    @Path("/restart")
    @Produces(MediaType.APPLICATION_JSON)
    public int restartContainerd() {
        return SystemdEngine.systemdEngine("restart", AppData.CONTAINERD_SERVICE_NAME);
    }
}
