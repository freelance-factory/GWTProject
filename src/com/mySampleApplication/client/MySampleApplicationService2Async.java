package com.mySampleApplication.client;

import java.util.ArrayList;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface MySampleApplicationService2Async {
//    void getMessage2(String msg, AsyncCallback<String> async);
    void getList(AsyncCallback<ArrayList> async);
}
