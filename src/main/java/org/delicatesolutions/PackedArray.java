package org.delicatesolutions;

/**
 * Question
 * <p>
 * Define an array to be packed if all its values are positive, each value n appears n times and all equal values are in
 * consecutive locations. So for example, {2, 2, 3, 3, 3} is packed because 2 appears twice and 3 appears three times.
 * But {2, 3, 2, 3, 3} is not packed because the 2s are not in consecutive locations. And {2, 2, 2, 3, 3, 3} is not
 * packed because 2 appears three times.
 * Write a method named isPacked that returns 1 if its array argument is packed, otherwise it returns 0.
 * You may assume that the array is not null
 * If you are programming in Java or C#, the function signature is
 * int isPacked(int[ ] a)
 * If you are programming in C++ or C, the function signature is
 * int isPacked(int a[ ], int len) where len is the length of the array.
 * Examples
 * <p>
 * a is                 then function returns           reason
 * {2, 2, 1}            1                               because there are two 2s and one 1 and equal values  appear in
 * consecutive locations.
 * <p>
 * {2, 2, 1,2, 2}       0                               Because there are four 2s (doesn't matter that they
 * are in groups of 2)
 * <p>
 * {4, 4, 4,            1                               because 4 occurs four times, 3 appears three times,
 * 4, 1, 2, 2,                                          2 appears two times and 1 appears once and equal
 * 3, 3, 3}                                             values are in consecutive locations.
 * <p>
 * {7,7,7,7,7,7,7,1}    1                               because 7 occurs seven times and 1 occurs once.
 * <p>
 * {7, 7, 7,            0                               because the 7s are not in consecutive locations.
 * 7, 1, 7, 7,
 * 7}
 * <p>
 * {7, 7, 7,            1                               because 7 occurs seven times
 * 7, 7, 7, 7}
 * <p>
 * {}                   1                               because there is no value that appears the wrong
 * number of times
 * <p>
 * {1, 2, 1}            0                               because there are too many 1s
 * <p>
 * {2, 1, 1}            0                               because there are too many 1s
 * <p>
 * {-3, -3, -3}         0                               because not all values are positive
 * <p>
 * {0, 2, 2}            0                               because 0 occurs one time, not zero times.
 * <p>
 * {2, 1, 2}            0                               because the 2s are not in consecutive locations
 * Hint: Make sure that your solution handles all the above examples correctly!
 */

/*
  Thinking
  n appears n times         n = count
  all values are positive   -n != count
  consecutive locations
  0 occurs one time, not zero times. 0 != count

 */

import java.util.ArrayList;
import java.util.List;


public class PackedArray {

    public static int isPacked(int[] a) {
        if (a.length == 0) {
            return 1;
        }

        int count = 1;
        int value = a[0];

        List<Integer> processed = new ArrayList<>();

        for (int i = 1; i < a.length; i++) {
            if (processed.contains(a[i])) {
                return 0;
            }
            if (a[i] == value) {
                count++;
            } else {
                if (count != value) {
                    return 0; // Condition: Value appears count times
                }
                processed.add(value);
                count = 1;
                value = a[i];
            }
        }

        return count == value ? 1 : 0; // Check the last value
    }

    public static void main(String[] args) {
        int[] arrayCorrect = {2, 2, 3, 3, 3};
        int[] arrayInCorrect = {2, 3, 2, 3, 3};
        int[] array1 = {2, 2, 1};
        int[] array2 = {2, 2, 1, 2, 2};
        int[] array3 = {4, 4, 4, 4, 1, 2, 2, 3, 3, 3};
        int[] array4 = {7, 7, 7, 7, 7, 7, 7, 1};
        int[] array5 = {7, 7, 7, 7, 1, 7, 7, 7};
        int[] array6 = {7, 7, 7, 7, 7, 7, 7};
        int[] array7 = {};
        int[] array8 = {1, 2, 1};
        int[] array9 = {2, 1, 1};
        int[] array10 = {-3, -3, -3};
        int[] array11 = {0, 2, 2};
        int[] array12 = {2, 1, 2};

        System.out.println(isPacked(arrayCorrect)); // Output: 1
        System.out.println(isPacked(arrayInCorrect)); // Output: 0
        System.out.println(isPacked(array1)); // Output: 1
        System.out.println(isPacked(array2)); // Output: 0
        System.out.println(isPacked(array3)); // Output: 1
        System.out.println(isPacked(array4)); // Output: 1
        System.out.println(isPacked(array5)); // Output: 0
        System.out.println(isPacked(array6)); // Output: 1
        System.out.println(isPacked(array7)); // Output: 1
        System.out.println(isPacked(array8)); // Output: 0
        System.out.println(isPacked(array9)); // Output: 0
        System.out.println(isPacked(array10)); // Output: 0
        System.out.println(isPacked(array11)); // Output: 0
        System.out.println(isPacked(array12)); // Output: 0
    }
}
