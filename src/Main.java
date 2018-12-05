package src;

import io.undertow.Undertow;
import io.undertow.server.RoutingHandler;
import io.undertow.server.handlers.PathHandler;

public class Main {
    public static void main(String[] args) {
        RoutingHandler routingHandler = new RoutingHandler();
        routingHandler.add("GET", "/", Controller::index);
        routingHandler.add("GET", "/another", Controller::another);

        PathHandler pathHandler = new PathHandler();
        pathHandler.addPrefixPath("/", routingHandler);

        Undertow undertow = Undertow.builder()
            .addHttpListener(4567, "0.0.0.0")
            .setHandler(pathHandler)
            .build();
        undertow.start();
    }
}
