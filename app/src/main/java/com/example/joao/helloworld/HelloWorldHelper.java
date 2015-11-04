package com.example.joao.helloworld;

/**
 * Created by joao on 11/4/15.
 */
public class HelloWorldHelper {
    public String message = "Hello world!";

    public void toggleMessage() {
        if (message.equals("Hello world!")) {
            message = new String("Goodbye world!");
        } else {
            message = new String("Hello world!");
        }
    }
}
