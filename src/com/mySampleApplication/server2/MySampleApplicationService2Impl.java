package com.mySampleApplication.server2;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.mySampleApplication.client.MySampleApplicationService2;

import java.util.ArrayList;


public class MySampleApplicationService2Impl extends RemoteServiceServlet implements MySampleApplicationService2 {
    // Implementation of sample interface method
//    public String getMessage2(String msg) {
//        return "El Cliente dijo \"" + msg + "\"<br>El Servidor respondió \"¡Hola!\"";
//    }
    public ArrayList getCellList(ArrayList cl) {
        cl.add("Lamborghini Murciélago");
        cl.add("Ferrari F350");
        cl.add("Bugatti Veyron");
        cl.add("Ford GT");
        return cl;
    }

}