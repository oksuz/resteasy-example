package com.yunusoksuz.restapi.services.hello;

import com.yunusoksuz.restapi.services.HelloService;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 * Created by yo on 13/10/2016.
 */

@Stateless(name = "HelloBean")
public class HelloServiceImp implements HelloService {

    public String getMessage(String name) {
        if (null == name) {
            name = "ynsbl";
        }

        return "hello " + name;
    }

}
