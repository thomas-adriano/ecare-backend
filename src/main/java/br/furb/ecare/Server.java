package br.furb.ecare;

import org.glassfish.jersey.server.ResourceConfig;

import javax.ws.rs.ApplicationPath;

/**
 * Created by thomas on 2/26/16.
 */
@ApplicationPath("/")
public class Server extends ResourceConfig {

    public Server() {
        packages("br.furb.ecare");
    }

}
