package com.mySampleApplication.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;


/**
 * Entry point classes define <code>onModuleLoad()</code>
 */
public class MySampleApplication implements EntryPoint {

    /**
     * This is the entry point method.
     */
    public void onModuleLoad() {
        final Button button = new Button("Click me if you want a message from the Server");
        final Button button1 = new Button("Clickeame si querés un mensaje del Servidor");
        final Label label = new Label();
        final Label label1 = new Label();
//        final VerticalPanel panel = new VerticalPanel();
//        final CellList cellList = new CellList<>;

        button.addClickHandler(new ClickHandler() {
            public void onClick(ClickEvent event) {
                if (label.getText().equals("")) {
                    MySampleApplicationService.App.getInstance().getMessage("Hello, World!", new MyAsyncCallback(label));
//               Lo que hace el .App.getInstance(): Ya que no podemos llamar a MySampleApplicationService.getMessage porque
//               es una interfaz, lo que hace el .App.getInstance() es instanciarla para poder llamarla y poder obtener
//               el mensaje.
                } else {
                    label.setText("");
                }
            }
        });

        button1.addClickHandler(new ClickHandler() {
            public void onClick(ClickEvent event) {
                if (label.getText().equals("")) {
                    MySampleApplicationService2.App.getInstance().getMessage2("¡Hola, mundo!", new MyAsyncCallback2(label));
                } else {
                    label.setText("");
                }
            }
        });

                // Assume that the host HTML has elements defined whose
        // IDs are "slot1", "slot2".  In a real app, you probably would not want
        // to hard-code IDs.  Instead, you could, for example, search for all
        // elements with a particular CSS class and replace them with widgets.
        //


        RootPanel.get("slot1").add(button);
        RootPanel.get("slot2").add(label);
        RootPanel.get("slot3").add(button1);
        RootPanel.get("slot4").add(label1);
    }

    private static class MyAsyncCallback implements AsyncCallback<String> {
        private Label label;

        public MyAsyncCallback(Label label) {
            this.label = label;
        }

        public void onSuccess(String result) {
            label.getElement().setInnerHTML(result);
        }

        public void onFailure(Throwable throwable) {
            label.setText("Failed to receive answer from server!");
        }
    }

    private static class MyAsyncCallback2 implements AsyncCallback<String> {
        private Label label;

        public MyAsyncCallback2(Label label) {
            this.label = label;
        }

        public void onSuccess(String result) {
            label.getElement().setInnerHTML(result);
        }

        public void onFailure(Throwable throwable) {
            label.setText("¡Falló la recepción de respuesta del Servidor!");
        }
    }
}
