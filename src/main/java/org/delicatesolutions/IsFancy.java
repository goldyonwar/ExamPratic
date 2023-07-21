package org.delicatesolutions;

/*
A fancy number is a number in the sequence 1, 1, 5, 17, 61, ... .
Note that first two fancy numbers are 1 and any fancy number other than the first two is sum of the three times previous
 one and two times the one before that. See below:
1,
1,
3*1 +2*1 = 5
3*5 +2*1 = 17
3*17 + 2*5 = 61
Write a function named isFancy that returns 1 if its integer argument is a Fancy number, otherwise it returns 0.
 The signature of the function is
int isFancy(int n)
 */
public class IsFancy {
    public static int isFancy(int n) {
        int firstNumber, secondNumber = 1, thirdNumber = 1;
        boolean isFancy = n == thirdNumber;
        if (n < 1) {
            return 0;
        }

        while (n > thirdNumber) {
            firstNumber = secondNumber;
            secondNumber = thirdNumber;
            thirdNumber = firstNumber * 2 + secondNumber * 3;
            isFancy = thirdNumber == n;
        }
        return isFancy ? 1 : 0;
    }

    public static void main(String[] args){
        System.out.println(isFancy(5));
        System.out.println(isFancy(17));
        System.out.println(isFancy(61));
        System.out.println(isFancy(1));
        System.out.println(isFancy(6));
        System.out.println(isFancy(7));
    }
}
