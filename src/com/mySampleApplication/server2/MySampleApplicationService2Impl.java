package com.mySampleApplication.server2;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.mySampleApplication.client.MySampleApplicationService2;


public class MySampleApplicationService2Impl extends RemoteServiceServlet implements MySampleApplicationService2 {
    // Implementation of sample interface method
    public String getMessage2(String msg) {
        return "El Cliente dijo \"" + msg + "\"<br>El Servidor respondió \"¡Hola!\"";
    }
}