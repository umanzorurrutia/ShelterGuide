import com.sun.net.httpserver.HttpServer;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpExchange;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.util.Map;
import java.util.HashMap; // Import HashMap

public class MainView {
    public static void main(String[] args) throws IOException {
        // Create an HTTP server on port 8000
        HttpServer server = HttpServer.create(new InetSocketAddress(8000), 0);
        
        // Define a context for handling GET requests to the "/hello" endpoint
        server.createContext("/hello", new HelloHandler());
        
        // Start the server
        server.start();
        
        System.out.println("Server started on port 8000");
    }
    
    // Handler class for processing GET requests to the "/hello" endpoint
    static class HelloHandler implements HttpHandler {
        @Override
        public void handle(HttpExchange exchange) throws IOException {
            // Set the response headers
            exchange.getResponseHeaders().set("Content-Type", "text/plain");
            
            // Get the query parameters from the request URL
            String query = exchange.getRequestURI().getQuery();
            Map<String, String> params = parseQuery(query);
            String name = params.getOrDefault("name", "Anonymous");
            String age = params.getOrDefault("age", "Unknown");
            
            // Prepare the response message
            String response = "Hello, " + name + "! Your age is " + age + ".";
            
            // Send the response
            exchange.sendResponseHeaders(200, response.length());
            try (OutputStream os = exchange.getResponseBody()) {
                os.write(response.getBytes());
            }
        }
        
        // Helper method to parse query parameters
        private Map<String, String> parseQuery(String query) {
            // Split the query string by '&' and '=' to extract parameters
            String[] pairs = query.split("&");
            Map<String, String> params = new HashMap<>();
            for (String pair : pairs) {
                String[] keyValue = pair.split("=");
                if (keyValue.length == 2) {
                    params.put(keyValue[0], keyValue[1]);
                }
            }
            return params;
        }
    }
}
