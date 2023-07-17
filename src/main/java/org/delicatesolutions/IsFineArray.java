package org.delicatesolutions;

import static org.delicatesolutions.IsTwinPrime.isPrime;

/*
A twin prime is a prime number that differs from another prime number by 2.
A Fine array is defined to be an array in which every prime in the array has its twin in the array.
So {4, 7, 9, 6, 5} is a Fine array because 7 and 5 occurs. Note that {4, 9, 6, 33} is a Fine array since there are no primes.
 On the other hand, {3, 8, 15} is not a Fine array since 3 appear in the array but its twin 5 is not in the array.
Write a function named isFineArray that returns 1 if its array argument is a Fine array, otherwise it returns 0.
If you are programming in Java or C#, the function signature is int isFineArray (int [ ] a)
If you are programming in C or C++, the function signature is
int isFineArray (int a[ ], int len) where len is the number of elements in the array.
You may assume that there exists a function isPrime that returns 1 if it argument is a prime, otherwise
it returns 0. You do not have to write this function.
 */
public class IsFineArray {
    public static int isFineArray(int[] a) {
        sort(a);
        int twinNumber = -1;
        boolean isFine = false, hasPrime = false;
        for (int j : a) {
            if (isPrime(j)) {
                hasPrime = true;
                if (twinNumber == -1) {
                    twinNumber = j + 2;
                } else {
                    if (j == twinNumber) {
                        isFine = true;
                    }
                }
            }
        }
        return hasPrime ? (isFine ? 1 : 0) : 1;
    }

    private static void sort(int[] a) {
        int holder;
        boolean isExchanged;
        for (int i = 0; i < a.length - 1; i++) {
            isExchanged = false;
            for (int j = 0; j < a.length - 1; j++) {
                if (a[j] > a[j + 1]) {
                    holder = a[j + 1];
                    a[j + 1] = a[j];
                    a[j] = holder;
                    isExchanged = true;
                }
            }
            if (!isExchanged) break;
        }
    }

    public static void main(String[] args) {
        System.out.println(isFineArray(new int[]{4, 7, 9, 6, 5}));
        System.out.println(isFineArray(new int[]{4, 9, 6, 33}));
        System.out.println(isFineArray(new int[]{3, 8, 15}));
    }
}
