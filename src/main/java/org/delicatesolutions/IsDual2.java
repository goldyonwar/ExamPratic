package org.delicatesolutions;

/*
An array is said to be dual if it has an even number of elements and each pair of consecutive even and odd elements sum
to the same value. Write a function named isDual that accepts an array of integers and returns 1 if the array is dual,
otherwise it returns 0. Examples: {1, 2, 3, 0} is a dual array (because 1+2 = 3+0 = 3), {1, 2, 2, 1, 3, 0}
is a dual array (because 1+2 = 2+1 = 3+0 = 3), {1, 1,2, 2}</td> is not a dual array (because 1+1 is not equal to 2+2),
{1, 2, 1}</td> array (because array does not have an even number of elements), {} is a dual array. If you are programming
in Java or C#, the function signature is
int isDual(int[ ] a)
If you are programming in C or C++, the function signature is
<td> is not a dual
int isDual(int a[ ], int len)
where len is the number of elements in the array.
 */
public class IsDual2 {
    public static int isDual(int[] a) {

        if (a == null || a.length % 2 != 0) {
            return 0;
        }
        if (a.length == 0) {
            return 1;
        }
        int checker = a[0] + a[1];
        for (int i = 0; i < a.length; i += 2) {
            if (a[i] + a[i + 1] != checker) {
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args){
        System.out.println(isDual(null));
        System.out.println(isDual(new int[]{1,2,3}));
        System.out.println(isDual(new int[]{}));
        System.out.println(isDual(new int[]{1, 2, 3, 0}));
        System.out.println(isDual(new int[]{1, 2, 2, 1, 3, 0}));
        System.out.println(isDual(new int[]{1, 1,2, 2}));
        System.out.println(isDual(new int[]{1, 2, 1}));
    }
}
