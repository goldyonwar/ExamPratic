package org.delicatesolutions;

/**
 * Write a function named largestAdjacentSum that iterates through an array computing the sum of adjacent elements and
 * returning the largest such sum. You may assume that the array has at least 2 elements.
 * If you are writing in Java or C#, the function signature is int largestAdjacentSum(int[ ] a)
 * If you are writing in C or C++, the function signature is
 * int largestAdjacentSum(int a[ ], int len) where len is the number of elements in a
 * Examples:
 * if a is             return      because
 * {1, 2, 3, 4}        7 because 3+4 is larger than either 1+2 or 2+3 6 because 18-12 is larger than -12+9 or 9-10
 * {1, 2, 3, 4}
 * {18, -12, 9, -10}
 * {1,1,1,1,1,1,1,1,1} 2 because all adjacent pairs sum to 2 {1,1,1,1,1,2,1,1,1} 3 because 1+2 or 2+1 is the max sum of adjacent pairs
 */
public class LargestAdjacentSum {

    private static int largestAdjacentSum(int[] a) {
        int largestSum = Integer.MIN_VALUE;

        for (int i = 0; i < a.length-1; i++) {
            int sum = a[i] + a[i+1];
            if (sum > largestSum){
                largestSum = sum;
            }
        }

        return largestSum;
    }
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {18, -12, 9, -10};
        int[] arr3 = {1, 1, 1, 1, 1, 1, 1, 1, 1};
        int[] arr4 = {1, 1, 1, 1, 1, 2, 1, 1, 1};

        System.out.println(largestAdjacentSum(arr1)); // Output: 7
        System.out.println(largestAdjacentSum(arr2)); // Output: 6
        System.out.println(largestAdjacentSum(arr3)); // Output: 2
        System.out.println(largestAdjacentSum(arr4)); // Output: 3
    }


}
