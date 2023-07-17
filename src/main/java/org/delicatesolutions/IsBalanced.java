package org.delicatesolutions;

/*
A balanced array is defined to be an array where for every value n in the array, -n also is in the array.
For example {-2, 3, 2, -3} is a balanced array. So is {-2, 2, 2, 2}. But {-5, 2, -2} is not because 5 is not in the array.
Write a function named isBalanced that returns 1 if its array argument is a balanced array. Otherwise it returns 0.
If you are programming in Java or C#, the function signature is
int isBalanced (int [ ] a);
If you are programming in C or C++, the function signature is
int isBalanced(int a[ ], int len) where len is the number of elements in the array.
There are three questions on this test. You have two hours to complete it. Please do your own work.
You are not allowed to use any methods or functions provided by the system unless explicitly stated in the question.
In particular, you are not allowed to convert int to a String or vice-versa.
 */
public class IsBalanced {
    public static int isBalanced(int[] a) {
        for (int num : a) {
            boolean isNegativePresent = false;

            for (int i : a) {
                if (i == -num) {
                    isNegativePresent = true;
                    break;
                }
            }

            if (!isNegativePresent) {
                return 0;
            }
        }

        return 1;
    }
    public static void main(String[] args){
        System.out.println(isBalanced(new int[]{-2, 3, 2, -3}));
        System.out.println(isBalanced(new int[]{-2, 2, 2, 2}));
        System.out.println(isBalanced(new int[]{-5, 2, -2}));
    }
}
