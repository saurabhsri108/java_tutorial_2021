package com.javatutorial;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        int numbers2[] = {1, 2, 3, 4, 5};
        numbers[0] = 1;
        numbers[1] = 2;
        // numbers[90] = 3; // array index out of bounds
        System.out.println(numbers); // [I@4dd8dc3
        System.out.println(numbers2); // [I@6d03e736

        for(byte i = 0; i < numbers.length; i++)
            System.out.println(numbers[i]);

        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(numbers2));

        /* Multi-dimensional array */
        int[][] array = {{1, 2}, {3, 4}, {5, 6, 7}};
//        array[0][2] = 8; -> cannot assign value to index which doesn't exist
//        array[1][2] = 9;
        System.out.println(Arrays.deepToString(array));
        System.out.println(array[0][0]); // 1
        System.out.println(array[0][1]); // 2
//        System.out.println(array[0][2]);
        System.out.println(array[1][0]); // 3
        System.out.println(array[1][1]); // 4
//        System.out.println(array[1][2]);
        System.out.println(array[2][0]); // 5
        System.out.println(array[2][1]); // 6
        System.out.println(array[2][2]); // 7

        int[][] num = new int[3][3];
        System.out.println(Arrays.deepToString(num));
    }
}
