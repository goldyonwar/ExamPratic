package org.delicatesolutions;

/*
Write a function named sumDigits that sums the digits of its integer argument.
For example sumDigits(3114) returns 9, sumDigits(-6543) returns 18 and sumDigits(0) returns 0.

The signature of the function is int sumDigits (int n)
 */
public class SumDigits {
    public static int sumDigits(int n) {
        int sum = 0;
        if (n < 0) {
            n *= -1;
        }
        while (n % 10 != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumDigits(3114));
        System.out.println(sumDigits(-6543));
        System.out.println(sumDigits(0));
    }
}
