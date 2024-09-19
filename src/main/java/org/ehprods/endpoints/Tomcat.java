package org.ehprods.endpoints;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.ehprods.engines.BashEngine;
import org.ehprods.utils.AppData;

@Path("/tomcat")
public class Tomcat {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/start")
    public int startTomcat() {
        return BashEngine.switcherBashEngine(AppData.APACHE_TOMCAT_LOC + AppData.APACHE_TOMCAT_START);
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/stop")
    public int stopTomcat() {
        return BashEngine.switcherBashEngine(AppData.APACHE_TOMCAT_LOC + AppData.APACHE_TOMCAT_STOP);
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/restart")
    public int restartTomcat() {
        String[] commands = new String[]{AppData.APACHE_TOMCAT_LOC, AppData.APACHE_TOMCAT_STOP, AppData.APACHE_TOMCAT_START};
        return BashEngine.switcherBashEngine(commands);
    }

}
