# Arrays & Multi-dimensional Arrays

## Arrays

Arrays are collection of data having similar data type. For example:

```java
int[] numbers = new int[5];
// or
int numbers[] = new int[5];
```
This line instantiate an integer array of size 5. It can store 5 elements. Arrays are 0-based index objects, meaning that their index starts with 0.

In order to assign values we can do it as below:
```java
numbers[0] = 1;
numbers[1] = 2;
```
Doing this we will have **numbers=[1,2,0,0,0];** Basically, all the index of array instantiated gets initialized to 0, unless we assign values to them.

There is also another way to instantiate the array with inital values:
```java
int[] numbers = {1, 2, 0, 0, 0};
```
This is equivalent to above array. Let's print its value to our console:
```java
System.out.println(numbers); // this will not print values but some address notation: [I@4dd8dc3
```

To print our array values, we can do it in multiple ways:
```java
for(byte i = 0; i < numbers.length; i++):
    System.out.print(numbers[i] + ", "); // prints 1, 2, 0, 0, 0, 

System.out.println(Arrays.toString(numbers)); // in-built method - prints [1, 2, 0, 0, 0]
```

## Multi-dimensional Arrays

Multi-dimensional arrays is used to represent matrix [2D Array] or data points in cube [3D array] and so on. Let's take a look below on how to define them:

```java
int[][] array = {{1, 2}, {3, 4}, {5, 6, 7}};
System.out.println(Arrays.deepToString(array)); // [[1, 2], [3, 4], [5, 6, 7]]
```

In the above example, we can individual values by using these print statements:
```java
System.out.println(Arrays.deepToString(array));
System.out.println(array[0][0]); // 1
System.out.println(array[0][1]); // 2
// System.out.println(array[0][2]); -> This gives out of bound errors
System.out.println(array[1][0]); // 3
System.out.println(array[1][1]); // 4
// System.out.println(array[1][2]); -> This gives out of bound errors
System.out.println(array[2][0]); // 5
System.out.println(array[2][1]); // 6
System.out.println(array[2][2]); // 7
```

Another manner to define it is:
```java
int[][] num = new int[3][3];
System.out.println(Arrays.deepToString(num)); // [[0, 0, 0], [0, 0, 0], [0, 0, 0]]
```