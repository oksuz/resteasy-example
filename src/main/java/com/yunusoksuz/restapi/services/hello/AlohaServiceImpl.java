package com.yunusoksuz.restapi.services.hello;

import com.yunusoksuz.restapi.services.HelloService;

import javax.ejb.Stateless;

/**
 * Created by yo on 13/10/2016.
 */

@Stateless(name = "AlohaBean")
public class AlohaServiceImpl implements HelloService {

    public String getMessage(String name) {
        if (null == name) {
            name = "ynsbl";
        }

        return "aloha " + name;
    }

}
