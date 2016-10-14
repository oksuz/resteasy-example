package com.yunusoksuz.restapi.api;

import com.yunusoksuz.restapi.services.HelloService;
import org.json.JSONObject;

import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Created by yo on 13/10/2016.
 */

@Path("/")
public class HelloWorldResource {

    @EJB(beanName = "HelloBean")
    HelloService helloService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response helloWorld(@QueryParam("name") String name) {
        JSONObject object = new JSONObject().put("message", helloService.getMessage(name));

        return Response.ok(object.toString()).build();
    }

}
