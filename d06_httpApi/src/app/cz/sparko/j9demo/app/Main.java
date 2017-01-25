package cz.sparko.j9demo.app;

import jdk.incubator.http.HttpClient;
import jdk.incubator.http.HttpRequest;
import jdk.incubator.http.HttpResponse;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class Main {
    static long time = System.currentTimeMillis();

    public static void main(String[] args) throws Exception {
        //HttpClient client = HttpClient.newBuilder().followRedirects(HttpClient.Redirect.ALWAYS).build();
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(new URI("https://sparkoo.github.io/java9-presentation"))
                .GET()
                .build();       

        startStopwatch();
        sendRequest(client, request);
        System.out.println();
        //sendAsyncRequest(client, request);
    }

    static void sendRequest(HttpClient client, HttpRequest request) throws Exception {
        stopwatch("about to send");

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandler.asString());

        stopwatch("sent, about to print");

        String body = response.body();

        Arrays.stream(body.split("\n")).limit(5).forEach(System.out::println);
        stopwatch("done");
    }

    static void sendAsyncRequest(HttpClient client, HttpRequest request) throws Exception {
        stopwatch("about to send");

        Future<HttpResponse<String>> asyncResponse = client.sendAsync(request, HttpResponse.BodyHandler.asString());

        stopwatch("sent, about to get and print");

        String body = asyncResponse.get().body();

        Arrays.stream(body.split("\n")).limit(5).forEach(System.out::println);
        stopwatch("done");
    }

    static void startStopwatch() {
        time = System.currentTimeMillis();
    }

    static void stopwatch(String message) {
        System.out.println((System.currentTimeMillis() - time) + "ms - " + message);
        time = System.currentTimeMillis();
    }
}
