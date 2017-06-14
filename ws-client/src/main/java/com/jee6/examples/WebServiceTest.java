package com.jee6.examples;

import com.jee6.examples.HelloWorldService;
import com.jee6.examples.HelloWorld;

import javax.xml.namespace.QName;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Hello world!
 *
 */
public class WebServiceTest
{
    private static final String HOST = "localhost";
    private static final int PORT = 26026;
    private static final String CONTEXT = "ws-server";
    private static final String WSDL = "HelloWorldService";

    public static void main( String[] args ) throws MalformedURLException {
        String url = String.format("http://%s:%d/%s/%s?wsdl", HOST, PORT, CONTEXT, WSDL);

        System.out.println("Consuming ws from url: " + url);
        // Obtencion del cliente
        HelloWorldService helloWorldService = new HelloWorldService(
                new URL(url),
                new QName("http://examples.jee6.com/", "HelloWorldService"));


        HelloWorld helloWorld = helloWorldService.getHelloWorldPort();

        System.out.println(helloWorld.sayHello("Miztli testing"));

    }
}
