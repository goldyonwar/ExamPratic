package org.delicatesolutions;
/*
A Fibonacci number is a number in the sequence 1, 1, 2, 3, 5, 8, 13, 21,.... Note that first two Fibonacci numbers are 1 and any Fibonacci number other than the first two is the sum of the previous two Fibonacci numbers. For example, 2 = 1 + 1, 3 = 2 + 1, 5 = 3 + 2 and so on.
Write a function named isFibonacci that returns 1 if its integer argument is a Fibonacci number, otherwise it returns 0. The signature of the function is
int isFibonacci (int n)
 */
public class IsFibonacci {
    public static int isFibonacci(int n){
        int firstNum = 1,secondNum =1,temp=0;
        while (temp <=n){
            temp = firstNum + secondNum;
            firstNum = secondNum;
            secondNum = temp;
        }

        if (firstNum ==n){
            return 1;
        }

        return 0;
    }

    public static void main(String[] args){
        System.out.println(isFibonacci(13));
        System.out.println(isFibonacci(27));
        System.out.println(isFibonacci(1));
        System.out.println(isFibonacci(2));
    }
}
