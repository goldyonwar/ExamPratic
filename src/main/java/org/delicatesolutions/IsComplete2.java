package org.delicatesolutions;

/*
An array is defined to be complete if the conditions (a), (d) and (e) below hold. 
a. The array contains even numbers
b. Let min be the smallest even number in the array.
c. Let max be the largest even number in the array.
d. min does not equal max
e. All numbers between min and max are in the array
For example {-5, 6, 2, 3, 2, 4, 5, 11, 8, 7} is complete because a. The array contains even numbers
b. 2 is the smallest even number
c. 8 is the largest even number
d. 2 does not equal 8
e. the numbers 3, 4, 5, 6, 7 are in the array.
Examples of arrays that are not complete are:
{5, 7, 9, 13} condition (a) does not hold, there are no even numbers. {2, 2} condition (d) does not hold
{2, 6, 3, 4} condition (e) does not hold (5 is missing)
Write a function named isComplete that returns 1 if its array argument is a complete array. Otherwise it returns 0.
If you are writing in Java or C#, the function signature is
int isComplete (int[ ] a)
If you are writing in C or C++, the function signature is
int isComplete (int a[ ], int len) where len is the number of elements in the array.
 */
public class IsComplete2 {
    public static int isComplete(int[] a) {
        boolean isContainEven = false;
        int min =Integer.MAX_VALUE, max = Integer.MIN_VALUE;

        for (int k : a) {
            if (k % 2 == 0) {
                isContainEven = true;
                if (k < min) {
                    min = k;
                }

                if (k > max) {
                    max = k;
                }
            }

        }

        if (!isContainEven || max == min) {
            return 0;
        }

        sort(a);
        int checker = min+1;
        for (int j : a) {
            if (j < max && j == checker) {
                checker++;
            }
        }


        return checker==max? 1: 0;
    }

    private static void sort(int[] a) {
        int holder, endIndex = a.length - 1;
        boolean isExchanged = false;
        for (int i = 0; i < endIndex; i++) {
            for (int j = 0; j < endIndex; j++) {
                if (a[j] > a[j + 1]) {
                    holder = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = holder;
                    isExchanged = true;
                }
            }
            if (!isExchanged) break;
        }
    }

    public static void main(String[] args) {
        System.out.println(isComplete(new int[]{-5, 6, 2, 3, 2, 4, 5, 11, 8, 7}));
        System.out.println(isComplete(new int[]{5, 7, 9, 13}));
        System.out.println(isComplete(new int[]{2, 2}));
        System.out.println(isComplete(new int[]{2, 6, 3, 4}));
    }
}
