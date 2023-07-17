package org.delicatesolutions;
/*
A BEQ number is one whose cube contains exactly four 6’s. For example, 806 is a BEQ number because 806*806*806 = 523,606,616
which has four 6’s. But 36 is not a BEQ number because its cube is 46,656 which has only three 6’s. And neither is 1,118
because its cube is 1,676,676,672 which contains five 6’s. Write a function named findSmallestBEQ that returns the smallest BEQ number.
The function signature is
int findSmallestBEQnumber( )
Hint use modulo base 10 arithmetic and integer division to get the digits of an integer.
 */
public class FindSmallestBEQNumber {
    public static int findSmallestBEQnumber(){
        int result =1;
        while (!checkFourSix(getCube(result))){
            result++;
        }
        return result;
    }

    private static int getCube(int n){
        return n*n*n;
    }

    private static boolean checkFourSix(int n){
        int counter = 0 ;
        while (n != 0){
            if (n%10 == 6){
                counter++;
            }
            n/=10;
        }
        return counter == 4;
    }

    public static void main(String[] args){
        System.out.println(findSmallestBEQnumber());
    }
}
