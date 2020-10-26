package com.javatutorial;

import java.awt.*;

public class VariablesAndConstants {
    public static void main(String[] args) {

        /* Primitive Data Types */
        byte age = 25;
        short totalCareerRuns = 2000;
        int viewsCountYouTube = 123_456_789;
        long viewsCount = 3_123_456_789L;
        float principleAmount = 20.140987F;
        double returnInvestment = 400.980765434545656;
        boolean isEligible = true;
        isEligible = false;
        char myChar = 'A';
        myChar = 'B';

        System.out.println(age);
        System.out.println(totalCareerRuns);
        System.out.println(viewsCountYouTube);
        System.out.println(viewsCount);
        System.out.println(principleAmount);
        System.out.println(returnInvestment);
        System.out.println(isEligible);
        System.out.println(myChar);

        /* Min and Max Values */
        byte minByteValue = Byte.MIN_VALUE;
        byte maxByteValue = Byte.MAX_VALUE;

        short minShortValue = Short.MIN_VALUE;
        short maxShortValue = Short.MAX_VALUE;

        int minIntValue = Integer.MIN_VALUE;
        int maxIntValue = Integer.MAX_VALUE;

        long minLongValue = Long.MIN_VALUE;
        long maxLongValue = Long.MAX_VALUE;

        float minFloatValue = Float.MIN_VALUE;
        float maxFloatValue = Float.MAX_VALUE;

        double minDoubleValue = Double.MIN_VALUE;
        double maxDoubleValue = Double.MAX_VALUE;

        System.out.println("Minimum Byte Value: " + minByteValue);
        System.out.println("Maximum Byte Value: " + maxByteValue);
        System.out.println("Minimum Short Value: " + minShortValue);
        System.out.println("Maximum Short Value: " + maxShortValue);
        System.out.println("Minimum Int Value: " + minIntValue);
        System.out.println("Maximum Int Value: " + maxIntValue);
        System.out.println("Minimum Long Value: " + minLongValue);
        System.out.println("Maximum Long Value: " + maxLongValue);
        System.out.println("Minimum Float Value: " + minFloatValue);
        System.out.println("Maximum Float Value: " + maxFloatValue);
        System.out.println("Minimum Double Value: " + minDoubleValue);
        System.out.println("Maximum Double Value: " + maxDoubleValue);

        /* Default Values of primitive data types
        * byte: 0
        * short: 0
        * int: 0
        * long: 0
        * float: 0.0
        * double: 0.0
        * Default values of non-numeric variables in Java:
        * boolean: false
        * string: null
        * */

        /* Constant in Java */
        final byte ageF = 25;
        final short totalCareerRunsF = 2000;
        final int viewsCountYouTubeF = 123_456_789;
        final long viewsCountF = 3_123_456_789L;
        final float principleAmountF = 20.140987F;
        final double returnInvestmentF = 400.980765434545656;
        final boolean isEligibleF = true;
        final char myCharF = 'A';

        Point point1 = new Point(1, 2);
        Point point2 = point1;
        point2.x = 4;
        System.out.println(point2);
    }
}
