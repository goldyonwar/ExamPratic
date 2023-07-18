package org.delicatesolutions;

/*
Consider the prime number 11. Note that 13 is also a prime and 13 – 11 = 2. So, 11 and 13 are known as twin primes.
Similarly, 29 and 31 are twin primes. So is 71 and 73. However, there are many primes for which there is no twin.
Examples are 23, 67. A twin array is defined to an array which every prime that has a twin appear with a twin.
Some examples are
{3, 5, 8, 10, 27},                 // 3 and 5 are twins and both are present
{11, 9, 12, 13, 23},               // 11 and 13 are twins and both are present, 23 has no twin
{5, 3, 14, 7, 18, 67}.            // 3 and 5 are twins, 5 and 7 are twins, 67 has no twin

The following are NOT twin arrays:
{13, 14, 15, 3, 5}                 // 13 has a twin prime and it is missing in the array
{1, 17, 8, 25, 67}                 // 17 has a twin prime and it is missing in the array
Write a function named isTwin(int[ ] arr) that returns 1 if its array argument is a Twin array, otherwise
it returns 0.
 */
public class IsTwin {
    public static int isTwin(int[] a) {
        boolean hasTwin;
        int bigTwin, smallTwin;
        for (int k : a) {
            hasTwin = false;

            if (IsTwinPrime.isPrime(k)) {
                bigTwin = k + 2;
                smallTwin = k - 2;
                if (IsTwinPrime.isPrime(bigTwin)) {
                    hasTwin = containInArray(a, bigTwin);
                }
                if (hasTwin) {
                    return 1;
                } else {
                    if (IsTwinPrime.isPrime(smallTwin)) {
                        hasTwin = containInArray(a, smallTwin);
                        if (hasTwin) {
                            return 1;
                        } else {
                            return 0;
                        }
                    } else {

                        return 0;
                    }
                }

            }

        }

        return 0;
    }

    private static boolean containInArray(int[] a, int n) {
        for (int i : a) {
            if (i == n) {
                return true;

            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isTwin(new int[]{3, 5, 8, 10, 27}));
        System.out.println(isTwin(new int[]{11, 9, 12, 13, 23}));
        System.out.println(isTwin(new int[]{5, 3, 14, 7, 18, 67}));
        System.out.println(isTwin(new int[]{13, 14, 15, 3, 5}));
        System.out.println(isTwin(new int[]{1, 17, 8, 25, 67}));
    }


}
