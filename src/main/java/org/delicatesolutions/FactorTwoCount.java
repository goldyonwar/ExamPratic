package org.delicatesolutions;

/*
Write a function named factorTwoCount that returns the number of times that 2 divides the argument.
For example, factorTwoCount(48) returns 4 because 48/2 = 24

24/2 = 12
12/2 = 6
6/2 = 3
2 does not divide 3 evenly.
Another example: factorTwoCount(27) returns 0 because 2 does not divide 27.
The function signature is int factorTwoCount(int n);
 */
public class FactorTwoCount {
    public static int factorTwoCount(int n) {
        int count = 0;
        while (n % 2 == 0) {
            count++;
            n /= 2;
        }
        return count;
    }

    public static void main(String[] args){
        System.out.println(factorTwoCount(48));
        System.out.println(factorTwoCount(27));
    }
}
