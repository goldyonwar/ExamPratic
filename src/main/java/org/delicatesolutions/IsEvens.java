package org.delicatesolutions;
/*
An Evens number is an integer whose digits are all even. For example 2426 is an Evens number but 3224 is not.
Write a function named isEvens that returns 1 if its integer argument is an Evens number otherwise it returns 0.
The function signature is
int isEvens (int n)

 */
public class IsEvens {
    public static int isEvens(int n) {
        int checker = 0;
        while (n != 0) {
            checker = n % 10;
            if (checker % 2 != 0) {
                return 0;
            }
            n /= 10;
        }

        return 1;
    }

    public static void main(String[] args){
        System.out.println(isEvens(2426));
        System.out.println(isEvens(3224));
    }
}
