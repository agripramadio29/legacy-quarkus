package org.ehprods.endpoints;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.ehprods.engines.SystemdEngine;
import org.ehprods.utils.AppData;

@Path("/rabbitmq")
public class RabbitMQ {

    @GET
    @Path("/start")
    @Produces(MediaType.APPLICATION_JSON)
    public int startRabbitMQ() {
        return SystemdEngine.systemdEngine("start", AppData.RABBITMQ_SERVICE_NAME);
    }

    @GET
    @Path("/stop")
    @Produces(MediaType.APPLICATION_JSON)
    public int stopRabbitMQ() {
        return SystemdEngine.systemdEngine("stop", AppData.RABBITMQ_SERVICE_NAME);
    }

    @GET
    @Path("/restart")
    @Produces(MediaType.APPLICATION_JSON)
    public int restartRabbitMQ() {
        return SystemdEngine.systemdEngine("restart", AppData.RABBITMQ_SERVICE_NAME);
    }
}
