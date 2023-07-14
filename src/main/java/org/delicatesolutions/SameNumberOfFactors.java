package org.delicatesolutions;
/*
Write a function named sameNumberOfFactors that takes two integer arguments and returns 1 if they have the same number of factors. If either argument is negative, return -1. Otherwise return 0.
int sameNumberOfFactors(int n1, int n2) Examples:
if n1 is and n2 is      return
-6 21                   -1 (because one of the arguments is negative)
6 21                    1 (because 6 has four factors (1, 2, 3, 6) and so does 21 (1, 3, 7, 21)
8 12                    0 (because 8 has four factors(1, 2, 4, 8) and 12 has six factors (1, 2, 3, 4, 6, 12)
23 97                   1 (because 23 has two factors (1, 23) and so does 97 (1, 97))
0 1                     0 (because 0 has no factors, but 1 has one (1))
0 0                     1 (always true if n1 == n2)
 */
public class SameNumberOfFactors {
    public static int sameNumberOfFactors(int n, int n2) {
        if (n < 0 || n2 < 0) {
            return -1;
        }

        int end = n > n2 ? n : n2;
        int nFactorCount = 0, n2FactorCont = 0;
        for (int i = 1; i <= end; i++) {
            if (n != 0 && n % i == 0) {
                nFactorCount++;
            }
            if (n2 != 0 && n2 % i == 0) {
                n2FactorCont++;
            }
        }

        if (nFactorCount == n2FactorCont) {
            return 1;
        }

        return 0;
    }

    public static void main(String[] args) {
        System.out.println(sameNumberOfFactors(-6, 21));
        System.out.println(sameNumberOfFactors(6, 21));
        System.out.println(sameNumberOfFactors(8, 12));
        System.out.println(sameNumberOfFactors(23, 97));
        System.out.println(sameNumberOfFactors(0, 1));
        System.out.println(sameNumberOfFactors(0, 0));
    }
}
