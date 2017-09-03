package apascualco.blog.rest;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/pathHolaMundo")
@Api(value = "/HolaMundo", description = "Ejemplo basico rest hola mundo")
@Produces(MediaType.APPLICATION_JSON)
public class HolaMundo {

    @GET
    @Path("/metodoGet/")
    @ApiOperation(value = "Di hola")
    @Produces(MediaType.APPLICATION_JSON)
    public Response diHola(){
        return Response.status(200).entity("Hola mundo!!").build();
    }

}
