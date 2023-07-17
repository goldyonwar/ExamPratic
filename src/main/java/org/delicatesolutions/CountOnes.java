package org.delicatesolutions;

/*
Write a function named countOnes that returns the number of ones in the binary representation of its argument.
 For example, countOnes(9) returns 2 because the binary representation of 9 is 1001.
Some other examples:
countOnes(5) returns 2 because binary 101 equals 5 countOnes(15) returns 4 because binary 1111 equals 15.
You may assume that the argument is greater than 0.
The function prototype is int countOnes(int n);
Hint use modulo and integer arithmetic to count the number of ones.
 */
public class CountOnes {
    public static int countOnes(int n) {
        int count = 0, exec = n;
        while (exec != 0) {
            if (exec % 2 == 1) {
                count++;
            }
            exec /= 2;
        }
        return count;
    }

    public static void main(String[] args){
        System.out.println(countOnes(5));
        System.out.println(countOnes(9));
        System.out.println(countOnes(15));
    }
}
