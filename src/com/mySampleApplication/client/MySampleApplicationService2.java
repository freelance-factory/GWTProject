package com.mySampleApplication.client;

import java.util.ArrayList;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("MySampleApplicationService2")
public interface MySampleApplicationService2 extends RemoteService {
    // Sample interface method of remote interface
//    String getMessage2(String msg);
    ArrayList getList();

    /**
     * Utility/Convenience class.
     * Use MySampleApplicationService.App.getInstance() to access static instance of MySampleApplicationServiceAsync
     */
    public static class App {
        private static MySampleApplicationService2Async ourInstance = GWT.create(MySampleApplicationService2.class);

        public static synchronized MySampleApplicationService2Async getInstance() {
            return ourInstance;
        }
    }
}
