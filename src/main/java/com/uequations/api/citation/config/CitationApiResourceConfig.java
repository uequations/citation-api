package com.uequations.api.citation.config;

import com.uequations.api.citation.endpoint.CitationEndpoint;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import javax.ws.rs.ApplicationPath;
import java.util.Collections;

/**
 * @author Mensah Alkebu-Lan
 */
@Component
@ApplicationPath("/api")
public class CitationApiResourceConfig extends ResourceConfig {
    public CitationApiResourceConfig() {
        register(CitationEndpoint.class);
        setProperties(Collections.singletonMap(
                "jersey.config.server.response.setStatusOverSendError", true));
    }
}
