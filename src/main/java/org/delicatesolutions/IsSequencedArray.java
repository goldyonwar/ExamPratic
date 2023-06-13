package org.delicatesolutions;

/**
 * Define an m-n sequenced array to be an array that contains one or more occurrences of all the integers between m and
 * n inclusive. Furthermore, the array must be in ascending order and contain only those integers. For example,
 * {2, 2, 3, 4, 4, 4, 5} is a 2-5 sequenced array. The array {2, 2, 3, 5, 5, 5} is not a 2-5 sequenced array because it
 * is missing a 4. The array {0, 2, 2, 3, 3} is not a 2-3 sequenced array because the 0 is out of range. And
 * {1,1, 3, 2, 2, 4} is not a 1-4 sequenced array because it is not in ascending order.
 * Write a method named isSequencedArray that returns 1 if its argument is a m-n sequenced array, otherwise it returns
 * 0. If you are writing in Java or C# the function signature is
 * int isSequencedArray(int[ ] a, int m, int n)
 * If you are writing in C or C++ the function signature is
 * int isSequencedArray(int a[ ], int len, int m, int n) where len is the number of elements in the array a.
 * You may assume that m<=n Examples
 * if a is                  and m and n       return        reason
 * {1, 2, 3, 4, 5}              1    5           1          because the array contains all the numbers between 1 and 5
 * inclusive in ascending order and no other numbers.
 * {1, 3, 4, 2, 5}              1    5           0          because the array is not in ascending order.
 * {-5, -5, -4, -4,            -5   -2           1          because the array contains all the numbers between -5 and
 * -4, -3, -3, -2, -2, -2}                                 -2 inclusive in ascending order and no other numbers.
 * Note that duplicates are allowed.
 * {0, 1, 2, 3, 4, 5}           1    5           0          because 0 is not in between 1 and 5 inclusive
 * {1, 2, 3, 4}                 1    5           0          because there is no 5
 * {1, 2, 5}                    1    5           0          because there is no 3 or 4
 * {5, 4, 3, 2, 1}              1    5           0          because the array does not start with a 1. Furthermore,
 * it is not in ascending order.
 */
public class IsSequencedArray {
    public static int isSequencedArray(int[] a, int m, int n) {
        int checkerSize = n - m + 1;
        if (a.length < checkerSize){
            return 0;
        }
        int gen = m;
        int[] checker = new int[checkerSize];
        for (int i = 0; i < checkerSize; i++) {
            checker[i] = gen++;
        }

        int checkerIndex = 0;
        for (int j : a) {
            if (j != checker[checkerIndex]) {
                if (j != checker[++checkerIndex]) {
                    return 0;
                }
            }
        }

        return 1;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 3, 4, 2, 5};
        int[] arr3 = {-5, -5, -4, -4, -3, -3, -2, -2, -2};
        int[] arr4 = {0, 1, 2, 3, 4, 5};
        int[] arr5 = {1, 2, 3, 4};
        int[] arr6 = {1, 2, 5};
        int[] arr7 = {5, 4, 3, 2, 1};

        System.out.println(isSequencedArray(arr1, 1, 5));    // Output: 1
        System.out.println(isSequencedArray(arr2, 1, 5));    // Output: 0
        System.out.println(isSequencedArray(arr3, -5, -2));  // Output: 1
        System.out.println(isSequencedArray(arr4, 1, 5));    // Output: 0
        System.out.println(isSequencedArray(arr5, 1, 5));    // Output: 0
        System.out.println(isSequencedArray(arr6, 1, 5));    // Output: 0
        System.out.println(isSequencedArray(arr7, 1, 5));    // Output: 0
    }

}
