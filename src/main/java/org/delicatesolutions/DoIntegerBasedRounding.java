package org.delicatesolutions;

import java.util.Arrays;

/**
 * Define the n-based integer rounding of an integer k to be the nearest multiple of n to k. If two multiples of n are
 * equidistant use the greater one. For example
 * the 4-based rounding of 5 is 4 because 5 is closer to 4 than it is to 8,   // 0 , 4 ,8
 * the 5-based rounding of 5 is 5 because 5 is closer to 5 that it is to 10,  // 0 , 5 , 10
 * the 4-based rounding of 6 is 8 because 6 is equidistant from 4 and 8, so the greater one is used, the 13-based
 * rounding of 9 is 13, because 9 is closer to 13 than it is to 0,
 * Write a function named doIntegerBasedRounding that takes an integer array and rounds all its positive elements using
 * n-based integer rounding.
 * A negative element of the array is not modified and if n <=0, no elements of the array are modified. Finally you may
 * assume that the array has at least two elements.
 * Hint: In integer arithmetic, (6/4) * 4 = 4
 * If you are programming in Java or C#, the function signature is
 * void doIntegerBasedRounding(int[ ] a, int n) where n is used to do the rounding
 * If you are programming in C or C++, the function signature is
 * void doIntegerBasedRounding(int a[ ], int n, int len) where n is used to do the rounding and len is the number of
 * elements in the array a.
 * Examples
 * if a is                      and n is    then a becomes          reason
 * {1, 2, 3, 4, 5}              2           {2, 2, 4, 4, 6}         because the 2-based rounding of 1 is 2, the 2-based rounding of 2 is 2, the 2-based rounding of 3 is 4, the 2-based rounding of 4 is 4, and the 2-based rounding of 5 is 6.
 * {1, 2, 3, 4, 5}              3           {0, 3, 3, 3, 6}         because the 3-based rounding of 1 is 0, the 3-based roundings of 2, 3, 4 are all 3, and the 3-based rounding of 5 is 6.
 * {1, 2, 3, 4, 5}             -3           {1, 2, 3, 4, 5}         because the array is not changed if n <= 0.
 * {-1, -2, -3, -4, -5}         3           {-1, -2, -3, -4, -5}    because negative numbers are not rounded
 * {-18, 1, 2, 3, 4, 5}         4           {-18, 0, 4, 4, 4, 4}    because -18 is negative and hence is not modified, the 4-based rounding of 1 is 0, and the 4-based roundings of 2, 3, 4, 5 are all 4.
 * {1, 2, 3, 4, 5}              5           {0, 0, 5, 5, 5}
 * {1, 2, 3, 4, 5}              100         {0, 0, 0, 0, 0}
 */
public class DoIntegerBasedRounding {
    public static void doIntegerBasedRounding(int[] a, int n) {

        int lowerMultiple, upperMultiple, lowerDistance, upperDistance;
        if (n > 0) {
            //{1, 2, 3, 4, 5}
            for (int i = 0; i < a.length; i++) {
                if (a[i] < 0) {
                    continue;
                }
                // Calculate the lower multiple of n
                lowerMultiple = (a[i] / n) * n;
                // Calculate the distance between the lower multiple and the current element
                lowerDistance = lowerMultiple - a[i];

                // Convert to abs
                if (lowerDistance < 0) {
                    lowerDistance *= -1;
                }

                // Calculate the upper multiple of n
                upperMultiple = 0;
                for (int j = 1; upperMultiple <= a[i]; j++) {
                    upperMultiple = j * n;
                }

                // Calculate the distance between the upper multiple and the current element
                upperDistance = upperMultiple - a[i];

                // Convert to abs
                if (upperDistance < 0) {
                    upperDistance *= -1;
                }

                a[i] = (lowerDistance < upperDistance) ? lowerMultiple : upperMultiple;

            }
        }

        System.out.println(Arrays.toString(a));
    }


    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 2, 3, 4, 5};
        int[] array3 = {1, 2, 3, 4, 5};
        int[] array4 = {-1, -2, -3, -4, -5};
        int[] array5 = {-18, 1, 2, 3, 4, 5};
        int[] array6 = {1, 2, 3, 4, 5};
        int[] array7 = {1, 2, 3, 4, 5};

        doIntegerBasedRounding(array1, 2);
        doIntegerBasedRounding(array2, 3);
        doIntegerBasedRounding(array3, -3);
        doIntegerBasedRounding(array4, 3);
        doIntegerBasedRounding(array5, 4);
        doIntegerBasedRounding(array6, 5);
        doIntegerBasedRounding(array7, 100);
    }
}
