package org.delicatesolutions;
/*
A non-empty array a of length n is called an array of all possiblities if it contains all numbers between 0 and a.length-1 inclusive.
Write a method named isAllPossibilities that accepts an integer array and returns 1 if the array is an array of all possiblities, otherwise it returns 0.
If you are programming in Java or C#, the function signature is int isAllPossibilities(int[ ] a)
If you are programming in C or C++, the function signature is
int isAllPossibilities(int a[ ], int len) where len is the number of elements in the array
Examples
If the input array is           return
{1, 2, 0, 3}                    1
{3, 2, 1, 0}                    1
{1, 2, 4, 3}                    0 (because 0 not included and 4 is too big)
{0, 2, 3}                       0 (because 1 is not included)
{0}                             1
{}                              0
 */
public class IsAllPossibilities {
//   without sorting
//    public static int isAllPossibilities(int[] a) {
//        if (a.length < 1) {
//            return 0;
//        }
//        int[] checker = new int[a.length];
//        int[] validator = new int[a.length];
//
//        for (int i = 0; i < checker.length; i++) {
//            checker[i] = i;
//            validator[i] = 0;
//        }
//        boolean isContain;
//        for (int k : a) {
//            isContain = false;
//            for (int i : checker) {
//                if (k == i) {
//                    validator[i] += 1;
//                    isContain = true;
//                }
//            }
//            if (!isContain) {
//                return 0;
//            }
//        }
//
//        for (int j : validator) {
//            if (j != 1) {
//                return 0;
//            }
//        }
//
//        return 1;
//    }

    public static int isAllPossibilities(int[] a) {
        if (a.length < 1) {
            return 0;
        }

        bubbleSort(a);

        for (int i = 0; i < a.length; i++) {
            if (a[i]!=i){
                return 0;
            }
        }

        return 1;
    }
    static void bubbleSort(int[] a) {
        int i, j, temp;
        boolean swapped;
        for (i = 0; i < a.length - 1; i++) {
            swapped = false;
            for (j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {

                    // Swap arr[j] and arr[j+1]
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    swapped = true;
                }
            }

            // If no two elements were
            // swapped by inner loop, then break
            if (!swapped)
                break;
        }
    }

    public static void main(String[] args) {
        System.out.println(isAllPossibilities(new int[]{1, 2, 0, 3}));
        System.out.println(isAllPossibilities(new int[]{3, 2, 1, 0}));
        System.out.println(isAllPossibilities(new int[]{1, 2, 4, 3}));
        System.out.println(isAllPossibilities(new int[]{0, 2, 3}));
        System.out.println(isAllPossibilities(new int[]{0}));
        System.out.println(isAllPossibilities(new int[]{}));
    }
}
