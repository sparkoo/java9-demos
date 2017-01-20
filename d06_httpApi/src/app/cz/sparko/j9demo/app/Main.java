package cz.sparko.j9demo.app;

import jdk.incubator.http.HttpClient;
import jdk.incubator.http.HttpRequest;
import jdk.incubator.http.HttpResponse;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;

public class Main {
    public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();
        client.send(HttpRequest.newBuilder().uri(new URI("http://localhost:8000")).GET().build(),
                (statusCode, responseHeaders) -> {
                    System.out.println(statusCode);
                    System.out.println(responseHeaders);
                    return HttpResponse.BodyProcessor.asString(Charset.defaultCharset());
                });
    }
}
