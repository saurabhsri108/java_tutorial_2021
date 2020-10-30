package com.javatutorial;

public class TypeCastingOperators {
    public static void main(String[] args) {
        int x = 10;
        double y = 11.2 + x;
        System.out.println("Automatic Type Casted value: " + y);

        int z = x++;
        System.out.println(z); // 10
        System.out.println(x); // 11

        z += 10; // z = z + 10;
        System.out.println(z); // 20

        z -= 10; // z = z - 10;
        System.out.println(z); // 10
    }
}