package src;

import io.undertow.Undertow;
import io.undertow.server.RoutingHandler;

public class Main {
    public static void main(String[] args) {
        RoutingHandler routingHandler = new RoutingHandler();
        routingHandler.add("GET", "/", Controller::index);
        routingHandler.add("GET", "/another", Controller::another);

        Undertow undertow = Undertow.builder()
            .addHttpListener(4567, "0.0.0.0")
            .setHandler(routingHandler)
            .build();
        undertow.start();
    }
}
