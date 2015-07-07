package com.mySampleApplication.server;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.mySampleApplication.client.MySampleApplicationService3;


public class MySampleApplicationService3Impl extends RemoteServiceServlet implements MySampleApplicationService3 {
    // Implementation of sample interface method
//    public String getMessage2(String msg) {
//        return "El Cliente dijo \"" + msg + "\"<br>El Servidor respondió \"¡Hola!\"";
//    }
    public String getImageURL() {
        return "http://ichef.bbci.co.uk/news/976/mcs/media/images/82377000/jpg/_82377877_dogthinkstock.jpg";

//        RadioButton radioButton1 = new RadioButton("autoGroup","Lamborghini Gallardo");
//        RadioButton radioButton2 = new RadioButton("autoGroup","Ferrari F455");
//        VerticalPanel panel = new VerticalPanel();
//        panel.setSpacing(10);
//        panel.add(radioButton1);
//        panel.add(radioButton2);
//        return panel;
    }

}