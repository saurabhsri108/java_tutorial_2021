# Type Casting and Operators

## Type Casting
Type casting, in simple terms, is changing the data type of a variable from one form to another.

There are two types of type casting:

1. Automatic
2. Manual

Automatic type casting happens when a lower precision data type is transformed to higher precision data type. For example:

```java
package com.javatutorial;

public class TypeCastingOperators {
    public static void main(String[] args) {
        int x = 10;
        double y = 11.2 + x;
        System.out.println("Automatic Type Casted value: " + y); // 21.2
    }
}
```

Here, **y** is of double type. We added integer data type **x** value to **11.2** a double type. This automatically converts **x** to double type and then stores it to double type **y**. Here, the precision has increased to one decimal point.

Manual type casting happens when a higher precision data type is transformed to lower precision data type. This never happens automatically. Thus it needs to be done manually. For example:

```java
package com.javatutorial;

public class TypeCastingOperators {
    public static void main(String[] args) {
        double y = 11.27;
        int x = y; // this will give error of storing double to int type. So we do below thing:
        int z = (int) y; // we prefix (int) to double type y and this manually type casts y to integer.
        System.out.println(x); // 11
    }
}
```
Here, we prefix (int) to double type y and this manually type casts y to integer. This results in the loss of precision of value of decimal places.

## Operators

Operators are of multiple types:

**1. Arithmatic operators:**
They are there to perform arithmatic operations

In this we have: +, -, *, /, %, ++, --

**2. Assigment operators:**
These are there to assign values to variables

In this we have: =, +=, -=, *=, /=, %=, &=, !=, ^=, >>=, <<=

**3. Comparison operators:**
Comparison operators are used to evaluate two values to get a boolean result.

In this we have: ==, !=, >, <, >=, <=

**4. Logical operators:**
Logical operators are used to determine the logic between variables or values:

In this we have: &&, ||, !

**5. Bitwise operators:**
Bitwise operators are used to perform binary logic with bits of integers or long integers.

In this we have: &, |, ~, ^, <<, >>, >>>