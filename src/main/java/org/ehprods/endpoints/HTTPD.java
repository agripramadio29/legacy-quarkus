package org.ehprods.endpoints;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.ehprods.engines.SystemdEngine;
import org.ehprods.utils.AppData;

@Path("/httpd")
public class HTTPD {

    @GET
    @Path("/start")
    @Produces(MediaType.APPLICATION_JSON)
    public int startHttpd() {
        return SystemdEngine.systemdEngine("start", AppData.HTTPD_SERVICE_NAME);
    }

    @GET
    @Path("/stop")
    @Produces(MediaType.APPLICATION_JSON)
    public int stopHttpd() {
        return SystemdEngine.systemdEngine("stop", AppData.HTTPD_SERVICE_NAME);
    }

    @GET
    @Path("/restart")
    @Produces(MediaType.APPLICATION_JSON)
    public int restartHttpd() {
        return SystemdEngine.systemdEngine("restart", AppData.HTTPD_SERVICE_NAME);
    }
}
