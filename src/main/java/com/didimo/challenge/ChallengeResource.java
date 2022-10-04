package com.didimo.challenge;

import com.didimo.challenge.service.ChallengeService;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/alticci")
public class ChallengeResource {

    @Inject
    ChallengeService challengeService;

    @GET
    @Path("/{value}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response resolveAticci(@PathParam("value") Long value) {
        return Response.ok(challengeService.resolve(value)).build();
    }

}
