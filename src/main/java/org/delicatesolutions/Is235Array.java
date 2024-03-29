package org.delicatesolutions;

/*
 An array is defined to be a 235 array if the number of elements divisible by 2 plus the number of elements divisible
 by 3 plus the number of elements divisible by 5 plus the number of elements not divisible by 2, 3, or 5 is equal to
 the number of elements of the array. Write a method named is123Array that returns 1 if its array argument is a 235
 array, otherwise it returns 0.
If you are writing in Java or C#, the function signature is int is235Array(int[ ] a)
If you are writing in C or C++, the function signature is int is235Array(int a[ ], int len) where len is the length of a
Hint: remember that a number can be divisible by more than one number Examples
In the following: <a, b, c, d> means that the array has a elements that are divisible by 2, b elements that are
divisible by 3, c elements that are divisible by 5 and d elements that are not divisible by 2, 3, or 5.

if a is                     return       reason
{2, 3, 5, 7, 11}               1         because one element is divisible by 2 (a[0]), one is divisible by 3 (a[1]), one
                                         is divisible by 5 (a[2]) and two are not divisible by 2, 3, or 5 (a[3] and a[4]).
                                         So we have <1, 1, 1, 2> and 1+1+1+2 == the number of elements in the array.
{2, 3, 6, 7, 11}               0         because two elements are divisible by 2 (a[0] and a[2]), two are divisible by 3
                                         (a[1] and a[2]), none are divisible by 5 and two are not divisible by 2, 3, or 5
                                         (a[3] and a[4]). So we have <2, 2, 0, 2> and 2 + 2 + 0 + 2 == 6 != the number of
                                         elements in the array.
{2, 3, 4, 5, 6, 7, 8, 9, 10}   0         because <5, 3, 2, 1> and 5 + 3 + 2 + 1 == 11 != the number of elements in the array.
{2, 4, 8, 16, 32}              1         because <5, 0, 0, 0>
{3, 9, 27, 7, 1, 1, 1, 1, 1}   1         because <0, 3, 0, 6>
{7, 11, 77, 49}                1         because <0, 0, 0, 4>
{2}                            1         because <1, 0, 0, 0>
{}                             1         because <0, 0, 0, 0>
{7, 2, 7, 2, 7, 2, 7, 2, 3,    1         because <4, 1, 0, 6>
7, 7}

 */
public class Is235Array {
    public static int is235Array(int[] a) {
        int counter2 = 0, counter3 = 0, counter5 = 0,counterNon=0;
        for (int j : a) {
            if (j % 2 == 0) {
                counter2++;
            }

            if (j % 3 == 0) {
                counter3++;
            }

            if (j % 5 == 0) {
                counter5++;
            }

            if (j % 2 != 0 && j % 3 != 0 && j % 5 != 0){
                counterNon++;
            }
        }

        if (counter2 + counter3 + counter5 + counterNon == a.length) {
            return 1;
        }

        return 0;
    }

    public static void main(String[] args){
        System.out.println(is235Array(new int[]{2, 3, 5, 7, 11}));
        System.out.println(is235Array(new int[]{2, 3, 6, 7, 11}));
        System.out.println(is235Array(new int[]{2, 3, 4, 5, 6, 7, 8, 9, 10}));
        System.out.println(is235Array(new int[]{2, 4, 8, 16, 32}));
        System.out.println(is235Array(new int[]{3, 9, 27, 7, 1, 1, 1, 1, 1}));
        System.out.println(is235Array(new int[]{7, 11, 77, 49}));
        System.out.println(is235Array(new int[]{2}));
        System.out.println(is235Array(new int[]{}));
        System.out.println(is235Array(new int[]{7, 2, 7, 2, 7, 2, 7, 2, 3, 7, 7}));
    }
}
