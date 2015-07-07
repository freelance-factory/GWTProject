package com.mySampleApplication.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("MySampleApplicationService3")
public interface MySampleApplicationService3 extends RemoteService {
    // Sample interface method of remote interface
//    String getMessage2(String msg);
    String getImageURL();

    /**
     * Utility/Convenience class.
     * Use MySampleApplicationService.App.getInstance() to access static instance of MySampleApplicationServiceAsync
     */
    public static class App {
        private static MySampleApplicationService3Async ourInstance = GWT.create(MySampleApplicationService3.class);

        public static synchronized MySampleApplicationService3Async getInstance() {
            return ourInstance;
        }
    }
}
