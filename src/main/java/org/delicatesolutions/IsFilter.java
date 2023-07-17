package org.delicatesolutions;

/*
An array is defined to be a Filter array if it meets the following conditions
a. If it contains 9 then it also contains 11.
b. If it contains 7 then it does not contain 13.
So {1, 2, 3, 9, 6, 11} and {3, 4, 6, 7, 14, 16}, {1, 2, 3, 4, 10, 11, 13} and {3, 6, 5, 5, 13, 6, 13} are Filter arrays.
The following arrays are not Filter arrays: {9, 6, 18} (contains 9 but no 11), {4, 7, 13} (contains both 7 and 13)
Write a function named isFilter that returns 1 if its array argument is a Filter array, otherwise it returns 0.
If you are programming in Java or C#, the function signature is
int isFilter(int[ ] a)
If you are programming in C or C++, the function signature is
int isFilter(int a[ ], int len) where len is the number of elements in the array.

 */
public class IsFilter {
    public static int isFilter(int[] a) {
        boolean isIncludeNine = false, isIncludeEleven = false, isIncludeSeven = false, isIncludeThirteen = false;
        for (int j : a) {
            if (j == 9) {
                isIncludeNine = true;
            }
            if (j == 11) {
                isIncludeEleven = true;
            }
            if (j == 7) {
                isIncludeSeven = true;
            }
            if (j == 13) {
                isIncludeThirteen = true;
            }
        }
        if (isIncludeNine && !isIncludeEleven) {
            return 0;
        }

        if (isIncludeSeven && isIncludeThirteen) {
            return 0;
        }

        return 1;
    }

    public static void main(String[] args) {
        System.out.println(isFilter(new int[]{1, 2, 3, 9, 6, 11}));
        System.out.println(isFilter(new int[]{3, 4, 6, 7, 14, 16}));
        System.out.println(isFilter(new int[]{1, 2, 3, 4, 10, 11, 13}));
        System.out.println(isFilter(new int[]{3, 6, 5, 5, 13, 6, 13}));
        System.out.println(isFilter(new int[]{9, 6, 18}));
        System.out.println(isFilter(new int[]{4, 7, 13}));
    }
}
