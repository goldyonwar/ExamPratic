package org.delicatesolutions;

/**
 * An array is defined to be odd-heavy if it contains at least one odd element and every element whose value is odd is
 * greater than every even-valued element. So {11, 4, 9, 2, 8} is odd-heavy because the two odd elements (11 and 9) are
 * greater than all the even elements. And {11, 4, 9, 2, 3, 10} is not odd-heavy because the even element 10 is greater
 * than the odd element 9.
 * Write a function called isOddHeavy that accepts an integer array and returns 1 if the array is odd-heavy; otherwise
 * it returns 0.
 * If you are programming in Java or C#, the function signature is int isOddHeavy(int[ ] a)
 * If you are programming in C or C++, the function signature is int isOddHeavy(int a[ ], int
 * len) where len is the number of elements in the array
 * Some other examples:
 * if the inputisOddHeavy should return array is
 * {1} 1 (true vacuously)
 * {2} 0 (contains no odd elements)
 * {1, 1, 1, 1,1 1, 1}
 * {2, 4, 6, 8,1 (11, the only odd-valued element is 11} greater than all even-valued elements.
 * {-2, -4, -6,0 (-8, an even-valued element is greater -8, -11} than -11 an odd-valued element.)
 */

/*
    Thinking
    at least one odd element
    every odd element is greater than every even element
 */
public class OddHeavyArray {

    public static int isOddHeavy(int[] a) {
        boolean hasOdd = false;

        for (int i : a) {
            if (i % 2 != 0) {
                hasOdd = true;
                for (int j : a) {
                    if (j % 2 == 0 && i < j) {
                        return 0;// Condition: Every odd element is greater than every even element
                    }
                }
            }
        }

        return hasOdd ? 1 : 0;// Condition: Contains at least one odd element
    }


    public static void main(String[] args) {
        int[] array1 = {11, 4, 9, 2, 8};
        int[] array2 = {11, 4, 9, 2, 3, 10};
        int[] array3 = {1};
        int[] array4 = {2};
        int[] array5 = {1, 1, 1, 1, 1, 1, 1};
        int[] array6 = {2, 4, 6, 8, -8, -11};

        System.out.println(isOddHeavy(array1)); // Output: 1
        System.out.println(isOddHeavy(array2)); // Output: 0
        System.out.println(isOddHeavy(array3)); // Output: 1
        System.out.println(isOddHeavy(array4)); // Output: 0
        System.out.println(isOddHeavy(array5)); // Output: 1
        System.out.println(isOddHeavy(array6)); // Output: 0
    }
}
