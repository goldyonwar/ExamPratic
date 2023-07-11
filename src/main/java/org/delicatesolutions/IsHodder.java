package org.delicatesolutions;

/**
 * A hodder number is one that is prime and is equal to 2j-1 for some j. For example,
 * 31 is a hodder number because 31 is prime and is equal to 25-1 (in this case j = 5).
 * The first 4 hodder numbers are 3, 7, 31, 127
 * Write a function with signature int isHodder(int n) that returns 1 if n is a hodder number,
 * otherwise it returns 0. Recall that a prime number is a whole number greater than 1 that has
 * only two whole number factors, itself and 1.
 */
public class IsHodder {
    public static int isHodder(int n){
        if (isPrime(n)){
            int result = 1;
            while (result<n){
                result*=2;
                if (result-1 == n){
                    return 1;
                }
            }
        }
        return 0;
    }

    private static boolean isPrime(int n){
        for (int i = 2; i <= n/2 ; i++) {
            if (n%i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isHodder(3));
        System.out.println(isHodder(7));
        System.out.println(isHodder(31));
        System.out.println(isHodder(127));

    }
}
