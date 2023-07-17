package org.delicatesolutions;

/*
An array is called zero-balanced if its elements sum to 0 and for each positive element n, there exists another element
that is the negative of n. Write a function named isZeroBalanced that returns 1 if its argument is a zero-balanced array.
Otherwise it returns 0.
If you are writing in Java or C#, the function signature is int isZeroBalanced(int[ ] a)
If you are writing in C or C++, the function signature is
int isZeroBalanced(int a[ ], int len) where len is the number of elements in a
Examples:
if a is                 return
{1, 2, -2, -1}          1 because elements sum to 0 and each positive element has a corresponding negative element.
{-3, 1, 2, -2, -1, 3}   1 because elements sum to 0 and each positive element has a corresponding negative element.
{3, 4, -2, -3, -2}      0 because even though this sums to 0, there is no element whose value is -4
{0, 0, 0, 0, 0, 0}      1 this is true vacuously; 0 is not a positive number
{3, -3, -3}             0 because it doesn't sum to 0. (Be sure your function handles this array correctly)
{3}                     0 because this doesn't sum to 0
{}                      0 because it doesn't sum to 0
*/
public class IsZeroBalanced {
    public static int isZeroBalanced(int[] a) {
        if (a.length < 1 || a.length % 2 != 0) {
            return 0;
        }

        sort(a);
        int compareSize = a.length / 2;
        int[] positiveNumbers = new int[compareSize];
        int[] negativeNumbers = new int[compareSize];
        int positiveIndex = 0, negativeIndex = 0;
        for (int j : a) {
            if (j < 0) {
                negativeNumbers[negativeIndex++] = j;
            }
            if (j > 0) {
                positiveNumbers[positiveIndex++] = j;
            }
        }

        for (int i = 0; i < positiveNumbers.length; i++) {
            if (positiveNumbers[positiveNumbers.length - i - 1] + negativeNumbers[i] != 0) {
                return 0;
            }
        }


        return 1;
    }

    private static void sort(int[] a) {
        int temp;
        boolean isSwapped;

        for (int i = 0; i < a.length - 1; i++) {
            isSwapped = false;
            for (int j = 0; j < a.length - 1; j++) {
                if (a[j] > a[j + 1]) {
                    temp = a[j + 1];
                    a[j + 1] = a[j];
                    a[j] = temp;
                    isSwapped = true;
                }
            }
            if (!isSwapped) break;
        }

    }

    public static void main(String[] args) {
        System.out.println(isZeroBalanced(new int[]{1, 2, -2, -1}));
        System.out.println(isZeroBalanced(new int[]{-3, 1, 2, -2, -1, 3}));
        System.out.println(isZeroBalanced(new int[]{3, 4, -2, -3, -2}));
        System.out.println(isZeroBalanced(new int[]{0, 0, 0, 0, 0, 0}));
        System.out.println(isZeroBalanced(new int[]{3, -3, -3}));
        System.out.println(isZeroBalanced(new int[]{3}));
        System.out.println(isZeroBalanced(new int[]{}));
    }
}
