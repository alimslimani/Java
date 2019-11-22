package com.highfi.sys.java11;

import lombok.NonNull;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.*;
import java.util.function.Predicate;

public class Java11 {

    public static void main(String[] args) {
//     var

        var text = "123";
        text = "é";
        System.out.println(text);
        var myList = new ArrayList<Map<String, List<Integer>>>();
        for (var current : myList) {
            System.out.println(current);
        }

        Predicate<String> predicate = (@NonNull var a) -> true;


//        HttpClient
        var request = HttpRequest.newBuilder()
                .uri(URI.create("https://winterbe.com"))
                .GET()
                .build();
        var client = HttpClient.newHttpClient();
        HttpResponse<String> response = null;
        try {
            response = client.send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//        System.out.println(response.body());

//        sendAsync
        var request2 = HttpRequest.newBuilder()
                .uri(URI.create("https://winterbe.com"))
                .build();
        var client2 = HttpClient.newHttpClient();
        client2.sendAsync(request2, HttpResponse.BodyHandlers.ofString())
                .thenApply(HttpResponse::body)
                .thenAccept(System.out::println);

    }
}
