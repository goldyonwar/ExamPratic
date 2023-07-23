package org.delicatesolutions;

/*
Define a Meera array to be an array where a[n] is less than n for n = 0 to a.length-1.
For example, {-4, 0, 1, 0, 2} is a Meera array because a[0] < 0
a[1] < 1
a[2] < 2
a[3] < 3 a[4] < 4
{-1, 0, 0, 8, 0} is not a Meera array because a[3] is 8 which is not less than 3.
Write a function named isMeera that returns 1 if its array argument is a Meera array. Otherwise it returns 0.
If you are programming in Java or C#, the function signature is int isMeera (int[ ] a)
If you are programming in C or C++, the function signature is
int isMeera (int a[ ], int len) where len is the number of elements in the array.
 */
public class IsMeera6 {
    public static int isMeera(int[] a) {
        for (int n = 0; n < a.length; n++) {
            if (a[n] >= n) {
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args){
        System.out.println(isMeera(new int[]{-4, 0, 1, 0, 2}));
        System.out.println(isMeera(new int[]{-1, 0, 0, 8, 0}));
    }
}
