package org.delicatesolutions;

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
