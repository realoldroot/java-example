package com.zgs.spark;

import java.util.HashMap;
import java.util.Map;

import static spark.Spark.*;

public class HelloController {


    public static void main(String[] args) {

        //端口号默认是4567
        port(8000);


        get("/hello", (request, response) -> "Hello World");

        post("/hello", (request, response) -> "Hello World" + request.body());

        get("/private", (request, response) -> {
            response.status(401);
            return "Go Away";
        });

        get("/users/:name", (q, p) -> "selected user : " + q.params(":name"));

        get("/news/:section", (q, p) -> {
            p.type("text/xml");
            return "<?xml version=\"1.0\" encoding=\"UTF-8\"?><news>" + q.params("section") + "</news>";
        });

        get("json", (q, p) -> {
            p.type("application/json");
            Map<String, String> map = new HashMap<>(1);
            map.put("key1", "value1");
            return map;
        });

        /**
         * 接收json 返回json
         */
        post("/json", "application/json", (q, p) -> {
            String body = q.body();
            System.out.println(body);
            p.type("application/json");
            return body;
        });
    }
}
