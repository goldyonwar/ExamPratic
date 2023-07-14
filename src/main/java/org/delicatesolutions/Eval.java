package org.delicatesolutions;

/*
Write a function named eval that returns the value of the polynomial anxn + an-1xn-1 + ... + a1x1 + a0. If you are programming in Java or C#, the function signature is
double eval(double x, int[ ] a)
If you are programming in C or C++, the function signature is
double eval(double x, int a[ ], int len) where len is the number of elements in the array
Examples:
if x is if the input array is       this represents             eval should return
1.0 {0, 1, 2, 3, 4}                 4x^4 + 3x^3 + 2x^2 + x + 0     10.0
3.0 {3, 2, 1}                       x^2 + 2x + 3                   18.0
2.0 {3, -2, -1}                     -x^2 - 2x + 3                  -5.0
-3.0 {3, 2, 1}                      x^2 + 2x + 3                   6.0
2.0 {3, 2}                          2x + 3                         7.0
2.0 {4, 0, 9}                       9x^2+4                         40.0
2.0 {10}                            10                             10
10.0 {0, 1}                         x                              10


Copy and paste your answer here and click the "Submit answer" button
 */
public class Eval {
    public static double eval(double x, int[] a) {
        double result = 0;
        double xPower;
        for (int i = 0; i < a.length; i++) {
            xPower = x;
            for (int j = 1; j < i; j++) {
                xPower *= x;
            }
            if (i == 0) {
                result += a[i];
            } else {
                result += (a[i] * xPower);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(eval(1, new int[]{0, 1, 2, 3, 4}));
        System.out.println(eval(3, new int[]{3, 2, 1}));
        System.out.println(eval(2, new int[]{3, -2, -1}));
        System.out.println(eval(-3, new int[]{3, 2, 1}));
        System.out.println(eval(2, new int[]{3, 2}));
        System.out.println(eval(2, new int[]{4, 0, 9}));
        System.out.println(eval(2, new int[]{10}));
        System.out.println(eval(10, new int[]{0, 1}));
    }
}
