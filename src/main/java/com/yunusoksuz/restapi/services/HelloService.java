package com.yunusoksuz.restapi.services;

import javax.ejb.Local;

/**
 * Created by yo on 13/10/2016.
 */
@Local
public interface HelloService {

    public String getMessage(String message);

}
