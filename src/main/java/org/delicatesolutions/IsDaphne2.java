package org.delicatesolutions;

/*
A Daphne array is defined to be an array that contains at least one odd number and begins and ends with the same number of even numbers.
So {4, 8, 6, 3, 2, 9, 8,11, 8, 13, 12, 12, 6} is a Daphne array because it begins with three even numbers and ends with three even numbers 
and it contains at least one odd number
The array {2, 4, 6, 8, 6} is not a Daphne array because it does not contain an odd number.
The array {2, 8, 7, 10, -4, 6} is not a Daphne array because it begins with two even numbers but ends with three even numbers.
Write a function named isDaphne that returns 1 if its array argument is a Daphne array. Otherwise, it returns 0.
If you are writing in Java or C#, the function signature is int isDaphne (int[ ] a)
If you are writing in C or C++, the function signature is
int isDaphne (int a[ ], int len) where len is the number of elements in the array.
 */
public class IsDaphne2 {
    public static int isDaphne(int[] a) {
        if (a == null || a.length < 1 || a[0] % 2 != 0 || a[a.length - 1] % 2 != 0) {
            return 0;
        }

        boolean isContainOdd = false, doneStartEven = false, doneEndEven = false;
        int evenStartCounter = 0, evenEndCounter = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0 && !doneStartEven) {
                evenStartCounter++;
            } else {
                doneStartEven = true;
                isContainOdd = true;
            }

            if (a[(a.length - 1) - i] % 2 == 0 && !doneEndEven) {
                evenEndCounter++;
            } else {
                doneEndEven = true;
                isContainOdd = true;
            }

        }

        if (!isContainOdd || evenStartCounter != evenEndCounter) {
            return 0;
        }

        return 1;
    }

    public static void main(String[] args){
        System.out.println(isDaphne(null));
        System.out.println(isDaphne(new int[]{}));
        System.out.println(isDaphne(new int[]{4, 8, 6, 3, 2, 9, 8,11, 8, 13, 12, 12, 6}));
        System.out.println(isDaphne(new int[]{2, 4, 6, 8, 6}));
        System.out.println(isDaphne(new int[]{2, 8, 7, 10, -4, 6}));
    }
}
