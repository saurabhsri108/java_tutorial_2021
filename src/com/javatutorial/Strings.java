package com.javatutorial;

public class Strings {
    public static void main(String[] args) {
        String message = "Hello World";
        System.out.println(message.charAt(1));
        System.out.println(message.endsWith("orld"));
        System.out.println(message.startsWith("Hello"));
        System.out.println(message.contains("Hello"));
        System.out.println(message.concat(". How are you all?"));
        System.out.println(message.length());
        System.out.println(message.replace("World", "Saurabh"));
        System.out.println(message.indexOf("H"));
        System.out.println(message.indexOf("Hanuman"));
        System.out.println(message.toUpperCase());
        System.out.println(message.toLowerCase());
        System.out.println(message.trim());

        System.out.println(message);
    }
}
