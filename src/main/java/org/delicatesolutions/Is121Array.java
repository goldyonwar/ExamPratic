package org.delicatesolutions;

/**
 * Question
 * Define an array to be a 121 array if all its elements are either 1 or 2 and it begins with one or more 1s followed
 * by a one or more 2s and then ends with the same number of 1s that it begins with. Write a method named is121Array
 * that returns 1 if its array argument is a 121 array, otherwise, it returns 0.
 * If you are programming in Java or C#, the function signature is int is121Array(int[ ] a)
 * If you are programming in C or C++, the function signature is
 * int is121Array(int a[ ], int len) where len is the number of elements in the array a.
 * Examples
 *  a is            return                  Because
 *  {1, 2, 1}
 *  {1, 1, 2, 2, 2, 1, 1}
 *  {1, 1, 2, 2, 2, 1, 1, 1}
 *  {1, 1, 2, 1, 2, 1, 1}
 *  {1, 1, 1, 2, 2, 2, 1, 1, 1, 3}
 *  {1, 1, 1, 1, 1, 1}
 *  {2, 2, 2, 1, 1, 1, 2, 2, 2, 1, 1}
 *  {1, 1, 1, 2, 2, 2, 1, 1, 2, 2}
 *  {2, 2, 2}
 *
 */

public class Is121Array {

    public static int is121Array(int[] a) {
        int onesCount = 0;
        int twosCount = 0;
        int len = a.length;

        // Count the number of 1s at the beginning
        while (onesCount<len && a[onesCount] == 1){
            onesCount++;
        }

        // Count the number of 2s after the 1s
        while ((onesCount+ twosCount)<len && a[onesCount+twosCount] == 2){
            twosCount++;
        }

        // Check if the remaining elements are all 1s
        while ((onesCount+ twosCount)<len && a[onesCount+twosCount] == 1){
            onesCount++;
        }

        if (onesCount == 0 || twosCount == 0){
            return 0;
        }

        if(onesCount + twosCount == len){
            return 1;
        }else {
            return 0;
        }

    }
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 1};
        int[] arr2 = {1, 1, 2, 2, 2, 1, 1};
        int[] arr3 = {1, 1, 2, 2, 2, 1, 1, 1};
        int[] arr4 = {1, 1, 2, 1, 2, 1, 1};
        int[] arr5 = {1, 1, 1, 2, 2, 2, 1, 1, 1, 3};
        int[] arr6 = {1, 1, 1, 1, 1, 1};
        int[] arr7 = {2, 2, 2, 1, 1, 1, 2, 2, 2, 1, 1};
        int[] arr8 = {1, 1, 1, 2, 2, 2, 1, 1, 2, 2};
        int[] arr9 = {2, 2, 2};

        System.out.println(is121Array(arr1)); // Output: 1
        System.out.println(is121Array(arr2)); // Output: 1
        System.out.println(is121Array(arr3)); // Output: 1
        System.out.println(is121Array(arr4)); // Output: 0
        System.out.println(is121Array(arr5)); // Output: 0
        System.out.println(is121Array(arr6)); // Output: 0
        System.out.println(is121Array(arr7)); // Output: 0
        System.out.println(is121Array(arr8)); // Output: 0
        System.out.println(is121Array(arr9)); // Output: 0
    }
}
