package com.example;

import static spark.Spark.*;

public class App {
    public static void main(String[] args) {
        // Define a basic route
        get("/hello", (req, res) -> "Hello, Spark Java!");

        // Define a route with a parameter
        get("/hello/:name", (req, res) -> {
            String name = req.params(":name");
            return "Hello, " + name + "!";
        });

        // Start the server
        System.out.println("Server is running on http://localhost:4567");
    }
}
