package org.ehprods.endpoints;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.ehprods.engines.SystemdEngine;
import org.ehprods.utils.AppData;

@Path("/vsftpd")
public class Vsftpd {

    @GET
    @Path("/start")
    @Produces(MediaType.APPLICATION_JSON)
    public int startVsftpd() {
        return SystemdEngine.systemdEngine("start", AppData.VSFTPD_SERVICE_NAME);
    }

    @GET
    @Path("/stop")
    @Produces(MediaType.APPLICATION_JSON)
    public int stopVsftpd() {
        return SystemdEngine.systemdEngine("stop", AppData.VSFTPD_SERVICE_NAME);
    }

    @GET
    @Path("/restart")
    @Produces(MediaType.APPLICATION_JSON)
    public int restartVsftpd() {
        return SystemdEngine.systemdEngine("restart", AppData.VSFTPD_SERVICE_NAME);
    }
}
