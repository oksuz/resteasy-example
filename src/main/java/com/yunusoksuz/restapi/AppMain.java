package com.yunusoksuz.restapi;

import com.yunusoksuz.restapi.api.HelloWorldResource;

import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by yo on 13/10/2016.
 */
public class AppMain extends Application {

    private static Set<Class<?>> classes = new HashSet<>();

    public AppMain() {
        classes.add(HelloWorldResource.class);
    }

    @Override
    public Set<Class<?>> getClasses() {
        return classes;
    }
}
