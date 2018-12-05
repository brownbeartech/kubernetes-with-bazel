package src;

import io.undertow.Undertow;
import io.undertow.server.HttpHandler;
import io.undertow.server.HttpServerExchange;
import io.undertow.util.Headers;

public class Main {
    public static void main(String[] args) {
        Undertow undertow = Undertow.builder()
            .addHttpListener(4567, "0.0.0.0")
            .setHandler(new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    exchange.getResponseHeaders().put(Headers.CONTENT_TYPE, "text/plain");
                    exchange.getResponseSender().send("Hello World");
                }
            })
            .build();
        undertow.start();
    }
}
