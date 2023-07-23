package org.delicatesolutions;

/*
Define a positive number to be isolated if none of the digits in its square are in its cube. For example 163 is n isolated number because 69*69 = 26569 and 69*69*69 = 4330747 and the square does not contain any of the digits 0, 3, 4 and 7 which are the digits used in the cube. On the other hand 162 is not an isolated number because 162*162=26244 and 162*162*162 = 4251528 and the digits 2 and 4 which appear in the square are also in the cube.
Write a function named isIsolated that returns 1 if its argument is an isolated number, it returns 0 if its not an isolated number and it returns -1 if it cannot determine whether it is isolated or not (see the note below). The function signature is:
int isIsolated(long n)
Note that the type of the input parameter is long. The maximum positive number that can be represented as a long is 63 bits long. This allows us to test numbers up to 2,097,151 because the cube of 2,097,151 can be represented as a long. However, the cube of 2,097,152 requires more than 63 bits to represent it and hence cannot be computed without extra effort. Therefore, your function should test if n is larger than 2,097,151 and return -1 if it is. If n is less than 1 your function should also return -1.
Hint: n % 10 is the rightmost digit of n, n = n/10 shifts the digits of n one place to the right.
The first 10 isolated numbers are
N n*n n*n*n 248
3 9
8 64
9 81
14 196 24 576 28 784 34 1156 58 3364 63 3969
27
512
729
2744
13824
21952
39304
195112
250047
 */
public class IsIsolated {
    public static int isIsolated(long n) {
        if (n > 2097151) {
            return -1;
        }
        long square = n * n;
        long cube = n * n * n;

        if (isContain(cube, square)) {
            return 0;
        }
        return 1;
    }

    public static boolean isContain(long n, long m) {
        long job1;
        long job2;
        long worker = n;
        while (worker > 0) {
            job1 = worker % 10;
            job2 = m;
            while (job2 > 0) {
                if (job1 == job2 % 10) {
                    return true;
                }

                job2 /= 10;
            }
            worker /= 10;
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(isIsolated(162));
        System.out.println(isIsolated(63));
        System.out.println(isIsolated(2097152));
    }
}
