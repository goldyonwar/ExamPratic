package org.delicatesolutions;

/*
An array is defined to be complete if all its elements are greater than 0 and all even numbers that are less than the maximum even number are in the array.
For example {2, 3, 2, 4, 11, 6, 10, 9, 8} is complete because
  
a. all its elements are greater than 0
b. the maximum even integer is 10
c. all even numbers that are less than 10 (2, 4, 6, 8) are in the array.
But {2, 3, 3, 6} is not complete because the even number 4 is missing. {2, -3, 4, 3, 6} is not complete because it contains a negative number.
Write a function named isComplete that returns 1 if its array argument is a complete array. Otherwise it returns 0.
The function signature is int isComplete (int[ ] a)
 */

public class IsComplete3 {
    public static int isComplete(int[] a) {

        int maxEven = Integer.MIN_VALUE;
        int[] evens = new int[a.length];
        int evenIndex = 0;
        for (int j : a) {
            if (j <= 0) {
                return 0;
            }

            if (j % 2 == 0) {
                evens[evenIndex++] = j;
                if (maxEven < j) {
                    maxEven = j;
                }
            }
        }

        boolean isFound;
        for (int i = 2; i < maxEven; i += 2) {
            isFound = false;
            for (int j = 0; j < maxEven; j++) {
                if (evens[j] == i) {
                    isFound = true;
                    break;
                }
            }
            if (!isFound) {
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(isComplete(new int[]{2, 3, 2, 4, 11, 6, 10, 9, 8}));
        System.out.println(isComplete(new int[]{2, -3, 4, 3, 6}));
    }
}
