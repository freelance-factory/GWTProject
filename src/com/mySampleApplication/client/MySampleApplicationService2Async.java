package com.mySampleApplication.client;

import com.google.gwt.user.client.rpc.AsyncCallback;

import java.util.ArrayList;

public interface MySampleApplicationService2Async {
//    void getMessage2(String msg, AsyncCallback<String> async);
    void getCellList(AsyncCallback<ArrayList> async);
}
