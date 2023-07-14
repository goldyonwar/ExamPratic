package org.delicatesolutions;

/*
Write a function named allValuesTheSame that returns 1 if all elements of its argument array have the same value. Otherwise, it returns 0.
If you are programming in Java or C#, the function signature is int allValuesTheSame(int[ ] a)
If you are programming in C or C++, the function signature is
int allValuesTheSame(int a[ ], int len) where len is the number of elements in a
Examples:
if a is                             return
{1, 1, 1, 1}                        1
{83, 83, 83}                        1
{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}   1
{1, -2343456, 1, -2343456}          0
{0, 0, 0, 0, -1}                    0
{432123456}                         1
{-432123456}                        1
{}                                  0
 */
public class AllValuesTheSame {
    public static int allValuesTheSame(int[] a) {
        if (a.length < 1) {
            return 0;
        }

        int checker = a[0];
        for (int j : a) {
            if (checker != j) {
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(allValuesTheSame(new int[]{1, 1, 1, 1}));
        System.out.println(allValuesTheSame(new int[]{83, 83, 83}));
        System.out.println(allValuesTheSame(new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}));
        System.out.println(allValuesTheSame(new int[]{1, -2343456, 1, -2343456}));
        System.out.println(allValuesTheSame(new int[]{0, 0, 0, 0, -1}));
        System.out.println(allValuesTheSame(new int[]{432123456}));
        System.out.println(allValuesTheSame(new int[]{-432123456}));
        System.out.println(allValuesTheSame(new int[]{}));
    }
}
