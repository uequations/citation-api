package com.uequations.api.citation.endpoint;

import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

/**
 * @author Mensah Alkebu-Lan
 */
@Path("/v1/citation")
@Component
public class CitationEndpoint {

    @POST
    @Produces({MediaType.APPLICATION_JSON})
    public Response post(@Context UriInfo uriInfo,
                         @Context HttpServletRequest httpServletRequest) {

        return Response.created(uriInfo.getAbsolutePath()).build();
    }

}
