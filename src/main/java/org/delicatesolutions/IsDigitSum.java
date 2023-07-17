package org.delicatesolutions;

/*
Write a function named isDigitSum that returns 1 if sum of all digits of the first argument is less than the second
argument and 0 otherwise. For example isDigitSum(32121,10 ) would return 1 because 3+2+1+2+1 = 9 < 10.
More examples:
isDigitSum(32121,9) returns 0, isDigitSum(13, 6) returns 1, isDigitSum(3, 3) returns 0
The function should return ­1 if either argument is negative, so isDigitSum(-543, 3) returns 1.
The function signature is
int isDigitSum(int n, int m)
 */
public class IsDigitSum {

    public static int isDigitSum(int n, int m) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum < m ? 1 : 0;
    }
    public static void main(String[] args){
        System.out.println(isDigitSum(32121,10));
        System.out.println(isDigitSum(32121,9));
        System.out.println(isDigitSum(13,6));
        System.out.println(isDigitSum(3,3));
        System.out.println(isDigitSum(-543,3));
    }
}
