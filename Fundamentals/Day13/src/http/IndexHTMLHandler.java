package http;

import java.io.IOException;
import java.io.OutputStream;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

public class IndexHTMLHandler implements HttpHandler {

	@Override
	public void handle(HttpExchange exchange) throws IOException {
		byte[] response = "Welcome to My Index Page!".getBytes();
		exchange.sendResponseHeaders(200, response.length);
		OutputStream os = exchange.getResponseBody();
		os.write(response);
		os.close();
	}

}
