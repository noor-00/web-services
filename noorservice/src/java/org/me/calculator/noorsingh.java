/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.me.calculator;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 *
 * @author student
 */
@WebService(serviceName = "noorsingh")
public class noorsingh {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "operation")
    public double operation(@WebParam(name = "val") double val) {
        double cels  = (val*9/5 + 32);
        
        //TODO write your implementation code here:
        return cels;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "secondop")
    public double secondop(@WebParam(name = "val") double val) {
        //TODO write your implementation code here:
        double fh = (val-32)*0.556;
        return fh;
        
    }


}
