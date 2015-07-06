package com.mySampleApplication.server;

import java.util.ArrayList;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.mySampleApplication.client.MySampleApplicationService2;


public class MySampleApplicationService2Impl extends RemoteServiceServlet implements MySampleApplicationService2 {
    // Implementation of sample interface method
//    public String getMessage2(String msg) {
//        return "El Cliente dijo \"" + msg + "\"<br>El Servidor respondió \"¡Hola!\"";
//    }
    public ArrayList getList() {
        ArrayList al = new ArrayList();
        al.add("Lamborghini Gallardo");
        al.add("Ferrari F455 Spider");
        al.add("Bugatti Veyron");
        return al;

//        RadioButton radioButton1 = new RadioButton("autoGroup","Lamborghini Gallardo");
//        RadioButton radioButton2 = new RadioButton("autoGroup","Ferrari F455");
//        VerticalPanel panel = new VerticalPanel();
//        panel.setSpacing(10);
//        panel.add(radioButton1);
//        panel.add(radioButton2);
//        return panel;
    }

}