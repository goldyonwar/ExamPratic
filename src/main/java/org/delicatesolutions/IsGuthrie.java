package org.delicatesolutions;
/*
An integer is defined to be a Guthrie number if it is an element in the infinite sequence 
1, 2, 4, 7, 11, 16 ... Note that 2- 1=1, 4-2=2, 7-4=3, 11-7=4, 16-11=5 so for k>1, the kth element
of the sequence is equal to the k-1th element + k-1. E.G., for k=6, 16 is the kth element and is equal to 11
(the k-1th element) + k-1.
Write function named isGuthrie that returns 1 if its argument is a Guthrie number, otherwise it returns 0.
So isGuthrie(11) returns 1, is Guthrie(22) returns 1 and isGuthrie(8) returns 0 .
The function signature is int isGuthrie (int n)
 */
public class IsGuthrie {

    public static int isGuthrie (int n){
        int number = 1, index = 1;

        while (number <= n) {
            if (number == n) {
                return 1;
            }
            number += index++;
        }

        return 0;
    }

    public static void main(String[]args){
        System.out.println(isGuthrie(11));
        System.out.println(isGuthrie(22));
        System.out.println(isGuthrie(8));
    }
}
