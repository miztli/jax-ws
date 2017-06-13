package com.jee6.examples;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * Created by miztli on 12/06/17.
 */
@WebService
public class HelloWorld {
    private String message = new String("Hello world: ");

    public HelloWorld(){
        super();
    }

    @WebMethod
    public String sayHello(String name){
        return message + name;
    }
}
