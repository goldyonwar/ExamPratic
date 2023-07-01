package org.delicatesolutions;


/**
 * An array is zero-plentiful if it contains at least one 0 and every sequence of 0s is of length at least 4.
 * Write a method named isZeroPlentiful which returns the number of zero sequences if its array argument is zero-plentiful,
 * otherwise it returns 0.
 * If you are programming in Java or C#, the function signature is int isZeroPlentiful(int[ ] a)
 * If you are programming in C or C++, the function signature is
 * int isZeroPlentiful(int a[ ], int len) where len is the number of elements in the array a.
 * Examples
 * a is                             then function returns       reason
 * {0, 0, 0, 0, 0}                  1                           because there is one sequence of 0s and its length >= 4.
 * {1, 2, 0, 0, 0, 0, 2,            2                           because there are two sequences of 0s and both have lengths >= 4.
 * -18, 0, 0, 0, 0, 0, 12}
 * {0, 0, 0, 0, 0, 1, 0, 0,         3                           because three are three sequences of zeros and all have length >=4
 * 0, 0, 8, 0, 0, 0, 0, 0, 0}
 * {1, 2, 3, 4}                     0                           because there must be at least one 0.
 * {1, 0, 0, 0, 2, 0, 0, 0}         0                           because there is a sequence of zeros whose length is less < 4.
 * {0}                              0                           because there is a sequence of zeroes whose length is < 4.
 * {}                               0                           because there must be at least one 0.
 */
public class IsZeroPlentiful {
    public static int isZeroPlentiful(int[] a) {
        if (a.length < 4) {
            return 0;
        }
        int counter = 0, result = 0;

        for (int i : a) {
            if (i == 0) {
                counter++;
            }else {
                counter = 0;
            }

            if (counter == 4) {
                result++;
                counter = 0;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(isZeroPlentiful(new int[]{0, 0, 0, 0, 0}));
        System.out.println(isZeroPlentiful(new int[]{1, 2, 0, 0, 0, 0, 2, -18, 0, 0, 0, 0, 0, 12}));
        System.out.println(isZeroPlentiful(new int[]{0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 8, 0, 0, 0, 0, 0, 0}));
        System.out.println(isZeroPlentiful(new int[]{1, 2, 3, 4}));
        System.out.println(isZeroPlentiful(new int[]{1, 0, 0, 0, 2, 0, 0, 0}));
        System.out.println(isZeroPlentiful(new int[]{0}));
        System.out.println(isZeroPlentiful(new int[]{}));
    }
}
