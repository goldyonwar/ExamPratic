package org.delicatesolutions;

/*
 An array with an odd number of elements is said to be centered if all elements
one) are strictly greater than the value of the middle element.
Note that only arrays with an odd number of elements have a middle element.
Write a function named isCentered that accepts an integer array and returns 1 if it is a centered array, otherwise it returns 0.
Examples: {5, 3, 3, 4, 5} is not a centered array (the middle element 3 is not strictly less than all other elements),
{3, 2, 1, 4, 5} is centered (the middle element 1 is strictly less than all other elements),
{3, 2, 1, 4, 1} is not centered (the middle element 1 is not strictly less than all other elements),
 {3, 2, 1, 1, 4, 6} is not centered (no middle element since array has even number of elements),
 {} is not centered (no middle element), {1} is centered (satisfies the condition vacuously).
If you are programming in Java or C#, the function signature is
int isCentered(int[ ] a)
If you are programming in C or C++, the function signature is
int isCentered(int a[ ], int len)
where len is the number of elements in the array.

 */
public class IsCentered {
    public static int isCentered(int[] a) {
        if (a.length % 2 == 0) {
            return 0;
        }
        int arrayLength = a.length;
        int halfOfArray = arrayLength / 2;
        int middle;
        if (arrayLength == 1) {
            middle = a[0];
        } else {
            middle = a[halfOfArray];
        }
        for (int i = 0; i < halfOfArray; i++) {
            if (middle >= a[i] || middle >= a[arrayLength - 1 - i]) {
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(isCentered(new int[]{5, 3, 3, 4, 5}));
        System.out.println(isCentered(new int[]{3, 2, 1, 4, 5}));
        System.out.println(isCentered(new int[]{3, 2, 1, 4, 1}));
        System.out.println(isCentered(new int[]{3, 2, 1, 1, 4, 6}));
        System.out.println(isCentered(new int[]{}));
         System.out.println(isCentered(new int[]{1}));
    }
}
