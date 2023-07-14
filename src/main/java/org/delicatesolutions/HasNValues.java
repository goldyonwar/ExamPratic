package org.delicatesolutions;

/*
Write a function named hasNValues which takes an array and an integer n as arguments. It returns true if all the elements of the array are one of n different values.
If you are writing in Java or C#, the function signature is int hasNValues(int[ ] a, int n)
If you are writing in C or C++, the function signature is
int hasNValues(int a[ ], int n, int len) where len is the length of a
Note that an array argument is passed by reference so that any change you make to the array in your function will be visible when the function returns. Therefore, you must not modify the array in your function! In other words, your function should have no side effects.
0 (because there are two different values, 1 and -2343456) 0 (because there are two different values, 0 and -1)
Examples
if a is                         if n is     return
{1, 2, 2, 1}                    2           1 (because there are 2 different element values, 1 and 2)
{1, 1, 1, 8, 1, 1, 1, 3, 3}     3           1 (because there are 3 different element values, 1, 3, 8)
{1, 2, 3, 4, 5, 6, 7, 8 ,9, 10} 10          1 (because there are 10 different element values)
{1, 2, 2, 1}                    3           0 (because there are 2 different element values, not 3 as required)
{1, 1, 1, 8, 1, 1, 1, 3, 3}     2           0 (because there are 3 different element values, not 2 as required)
{1, 2, 3, 4, 5, 6, 7, 8 ,9, 10} 20          0 (because there are 10 different element values, not 20 as required)
Hint: There are many ways to solve this problem. One way is to allocate an array of n integers and add each unique element found in the array parameter to it. If you add n elements to the array, return 1, otherwise return 0.
 */
public class HasNValues {
    public static int hasNValues(int[] a, int n) {
        int[] values = new int[n];
        int count = 0;

        for (int num : a) {
            boolean found = false;
            for (int i = 0; i < count; i++) {
                if (values[i] == num) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                if (count >= n) {
                    return 0;
                }
                values[count++] = num;

            }
        }
        if (count==n){
            return  1;
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(hasNValues(new int[]{1, 2, 2, 1}, 2));
        System.out.println(hasNValues(new int[]{1, 1, 1, 8, 1, 1, 1, 3, 3}, 3));
        System.out.println(hasNValues(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 10));
        System.out.println(hasNValues(new int[]{1, 2, 2, 1}, 3));
        System.out.println(hasNValues(new int[]{1, 1, 1, 8, 1, 1, 1, 3, 3}, 2));
        System.out.println(hasNValues(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 20));
    }
}
