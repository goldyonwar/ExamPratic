package org.delicatesolutions;

/*
An array is called cube-perfect if all its elements are cubes of some integer. For example, {-1, 1, -8, -27, 8} is
cube-perfect because
-1 = -1 * -1 * -1
1 =1 * 1 * 1
-8 = -2 * -2 * -2
-27 = -3 * -3 * -3
8 =2 * 2 * 2
But {27, 3} is not cube-perfect because 3 is not the cube of any integer.
Write a function named isCubePerfect that returns 1 if its argument is cube-perfect, otherwise it returns 0.
If you are programming in Java or C#, the function signature is
int isCubePerfect(int[ ] a)
If you are programming in C or C++, the function signature is
int isCubePerfect(int a[ ], int len) where len is the number of elements in a.
Examples
if a is             return   because
{1, 1, 1, 1}        1        all elements are cubes of 1
{64}                1        64 = 4*4*4
{63}                0        63 is not the cube of any integer
{-1, 0, 1}          1        -1 = -1 * -1 * -1, 0 = 0 * 0 * 0, 1=1 * 1 * 1
{}                  1        no elements fail the cube test
{3, 7, 21, 36}      0        3 is not the cube of any integer





 */
public class IsCubePerfect {
    public static int isCubePerfect(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (!hasCubeNumber(a[i])) {
                return 0;
            }
        }
        return 1;
    }

    private static boolean hasCubeNumber(int n) {
        if (n == 0) {
            return true;
        }
        int calculator = 1;
        if (n < 0) {
            calculator *= -1;
        }
        int index = 0;
        while (index != n) {
            index += calculator;
            if (n == index * index * index) {
                return true;
            }

        }
        return false;
    }

    public static void main(String[] args){
        System.out.println(isCubePerfect(new int[]{1, 1, 1, 1}));
        System.out.println(isCubePerfect(new int[]{64}));
        System.out.println(isCubePerfect(new int[]{63}));
        System.out.println(isCubePerfect(new int[]{-1, 0, 1}));
        System.out.println(isCubePerfect(new int[]{}));
        System.out.println(isCubePerfect(new int[]{3, 7, 21, 36}));
    }
}
