package org.delicatesolutions;

/**
 * Write a function named largestDifferenceOfEvens which returns the largest difference between even
 * valued elements of its array argument. For example largestDifferenceOfEvens(new int[ ]{-2, 3, 4, 9})
 * returns 6 = (4 - (-2)). If there are fewer than 2 even numbers in the array, largestDifferenceOfEvens
 * should return -1.
 * If you are programming in Java or C#, the function signature is
 * int largestDifferenceOfEvens(int[ ] a)
 * If you are programming in C or C++, the function signature is
 * int largestDifferenceOfEvens(int a[ ], int len) where len is the number of elements in the array a.
 * Examples
 * if n is                      then function returns       reason
 * {1, 3, 5, 9}                 -1
 * {1, 18, 5, 7, 33}            -1
 * {[2, 2, 2, 2]}               0
 * {1, 2, 1, 2, 1, 4, 1, 6, 4}  4
 */
public class LargestDifferenceOfEvens {
    public static int largestDifferenceOfEvens(int[] a) {
        int result = 0, evenCount = 0, checker = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                evenCount++;
            for (int j = 0; j < a.length; j++) {
                if (i != j && a[i] % 2 == 0) {
                    checker = a[j] - a[i];
                    if (checker > result) {
                        result = checker;
                    }
                }
            }
            }

        }

        if (evenCount < 2) {
            return -1;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(largestDifferenceOfEvens(new int[]{1, 3, 5, 9}));
        System.out.println(largestDifferenceOfEvens(new int[]{1, 18, 5, 7, 33}));
        System.out.println(largestDifferenceOfEvens(new int[]{2, 2, 2, 2}));
        System.out.println(largestDifferenceOfEvens(new int[]{1, 2, 1, 2, 1, 4, 1, 6, 4}));

    }

}
