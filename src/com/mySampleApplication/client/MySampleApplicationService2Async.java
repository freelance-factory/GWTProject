package com.mySampleApplication.client;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface MySampleApplicationService2Async {
    void getMessage2(String msg, AsyncCallback<String> async);
}
