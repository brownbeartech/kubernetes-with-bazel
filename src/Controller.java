package src;

import io.undertow.server.HttpServerExchange;
import io.undertow.util.Headers;

public class Controller {
    public static void index(HttpServerExchange exchange) {
        exchange.getResponseHeaders().put(Headers.CONTENT_TYPE, "text/plain");
        exchange.getResponseSender().send("Home");
    }

    public static void another(HttpServerExchange exchange) {
        exchange.getResponseHeaders().put(Headers.CONTENT_TYPE, "text/plain");
        exchange.getResponseSender().send("Another");
    }
}
