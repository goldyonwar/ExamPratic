package org.delicatesolutions;

/*
Define an array to be n-primeable if for a given n, all elements of the array when incremented by n are prime. Recall that a prime number is a number that has no factors except 1 and itself. Write a method named isNPrimeable that has an array parameter and an integer parameter that defines n; the method returns 1 if its array parameter is n-primeable; otherwise it returns 0.
If you are programming in Java or C#, the function signature is int isNPrimeable(int[ ] a, int n)
If you are programming in C or C++, the function signature is
int isNPrimeable(int a[ ], int len, int n) where len is the number of elements in the array a.
Examples
If a is                     and n is  then function returns   reason
{5, 15, 27}                 2           1                     5+2=7 is prime, and 15+2=17 is prime, and 27+2=29 is prime
{5, 15, 27}                 3           0                     5+3=8 is not prime
{5, 15, 26}                 2           0                     26+2=28 is not prime
{1, 1, 1, 1, 1, 1, 1}       4           1                     1+4=5 is prime. This obviously holds for all elements in the array
{}                          2           1                     Since there are no elements in the array, there cannot exist one that is non-prime when 2 is added to it.

 */
public class IsNPrimeable {
    public static int isNPrimeable(int[] a, int n) {
        if (a.length == 0) {
            if (!isPrime(n)) {
                return 0;
            }
        }
        for (int j : a) {
            if (!isPrime(j + n)) {
                return 0;
            }
        }
        return 1;
    }

    private static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isNPrimeable(new int[]{5, 15, 27}, 2));
        System.out.println(isNPrimeable(new int[]{5, 15, 27}, 3));
        System.out.println(isNPrimeable(new int[]{5, 15, 26}, 2));
        System.out.println(isNPrimeable(new int[]{1, 1, 1, 1, 1, 1, 1}, 4));
        System.out.println(isNPrimeable(new int[]{}, 2));
    }
}
