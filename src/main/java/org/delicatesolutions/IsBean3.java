package org.delicatesolutions;

/*
A Bean array is defined to be an integer array where for every value n in the array, there is also an element 2n, 2n+1

or n/2 in the array.
For example, {4, 9, 8} is a Bean array because
For 4, 8 is present; for 9, 4 is present; for 8, 4 is present.
Other Bean arrays include {2, 2, 5, 11, 23}, {7, 7, 3, 6} and {0}.
The array {3, 8, 4} is not a Bean array because of the value 3 which requires that the array contains either the value
6, 7 or 1 and none of these values are in the array.
Write a function named isBean that returns 1 if its array argument is a Bean array. Otherwise it returns a 0.
If you are programming in Java or C#, the function signature is
int isBean(int[ ] a)
If you are programming in C or C++, the function signature is
int isBean(int a[ ], int len) where len is the number of elements in the array.
 */
public class IsBean3 {
    public static int isBean(int[] a) {
        boolean isContain;
        for (int j : a) {
            isContain = false;
            for (int k : a) {
                if (2 * j == k || 2 * j + 1 == k || j / 2 == k) {
                    isContain = true;
                    break;
                }
            }
            if (!isContain) {
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(isBean(new int[]{4, 9, 8}));
        System.out.println(isBean(new int[]{2, 2, 5, 11, 23}));
        System.out.println(isBean(new int[]{7, 7, 3, 6}));
        System.out.println(isBean(new int[]{0}));
        System.out.println(isBean(new int[]{3, 8, 4}));
    }
}
