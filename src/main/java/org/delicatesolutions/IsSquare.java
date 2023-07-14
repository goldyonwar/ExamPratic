package org.delicatesolutions;

/*
Write a function named isSquare that returns 1 if its integer argument is a square of some integer, otherwise it returns 0. Your function must not use any function or method (e.g. sqrt) that comes with a runtime library or class library! You will need to write a loop to solve this problem. Furthermore, your method should return as soon as the status of its parameter is known. So once it is known that the input parameter is a square of some integer, your method should return 1 and once it is known that the input is not a square, the method should return 0. There should be no wasted loop cycles, your method should be efficent!
The signature of the function is int isSquare(int n)
Examples:
if n is     return      reason
4           1           because 4 = 2*2
25          1           because 25 = 5*5
-4          0           because there is no integer that when squared equals -4. (note, -2 squared is 4 not -4)
8           0           because the square root of 8 is not an integer.
0           1           because 0 = 0*0
 */
public class IsSquare {
    public static int isSquare(int n){

        for (int i = 0; i <= n/2; i++) {
            if (i*i == n){
                return 1;
            }
        }
        return 0;
    }

    public static void main(String[] args){
        System.out.println(isSquare(4));
        System.out.println(isSquare(25));
        System.out.println(isSquare(-4));
        System.out.println(isSquare(8));
        System.out.println(isSquare(0));
    }
}
