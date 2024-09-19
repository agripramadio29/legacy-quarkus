package org.ehprods.endpoints;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.ehprods.engines.SystemdEngine;
import org.ehprods.utils.AppData;

@Path("/grafana")
public class Grafana {

    @GET
    @Path("/start")
    @Produces(MediaType.APPLICATION_JSON)
    public int startGrafana() {
        return SystemdEngine.systemdEngine("start", AppData.GRAFANA_SERVICE_NAME);
    }

    @GET
    @Path("/stop")
    @Produces(MediaType.APPLICATION_JSON)
    public int stopGrafana() {
        return SystemdEngine.systemdEngine("stop", AppData.GRAFANA_SERVICE_NAME);
    }

    @GET
    @Path("/restart")
    @Produces(MediaType.APPLICATION_JSON)
    public int restartGrafana() {
        return SystemdEngine.systemdEngine("restart", AppData.GRAFANA_SERVICE_NAME);
    }
}
