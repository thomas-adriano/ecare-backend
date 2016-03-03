package br.furb.ecare;

import org.eclipse.persistence.oxm.annotations.XmlPath;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Created by thomas on 2/26/16.
 */
@Path("status")
public class BeanAPI {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response status() {
        return Response.ok("OK").build();
    }


}
