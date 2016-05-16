package ru.log4j.Log4jHelloWorld;

import org.apache.log4j.Logger;

/**
 * Hello world!
 */
public class App {
    public static final Logger LOG=Logger.getLogger(App.class);
    public static void main(String[] args) {
       LOG.info("Hello World!");
    }
}

