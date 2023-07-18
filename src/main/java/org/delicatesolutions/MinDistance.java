package org.delicatesolutions;

/*
Write a function named minDistance that returns the smallest distance between two factors of a number. 
For example, consider 13013 = 1*7*11*13. Its factors are 1, 7, 11, 13 and 13013.
  
minDistance(13013) would return 2 because the smallest distance between any two factors is 2 (13 - 11 = 2).
 As another example, minDistance (8) would return 1 because the factors of 8 are 1, 2, 4, 8 and the smallest distance
 between any two factors is 1 (2 – 1 = 1).
The function signature is int minDistance(int n)

 */
public class MinDistance {
    public static int minDistance(int n) {
        int factorIndex = 0;
        int[] factors = new int[n];

        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                factors[factorIndex++] = i;
            }
        }
        int minDist = Integer.MAX_VALUE, distance;
        factorIndex--;
        for (int i = 0; i < factorIndex; i++) {
            for (int j = i + 1; j < factorIndex; j++) {
                distance = factors[i] - factors[j];
                if (distance < 0) {
                    distance *= -1;
                }
                if (minDist > distance) {
                    minDist = distance;
                }
            }
        }

        return minDist;

    }

    public static void main(String[] args) {
        System.out.println(minDistance(13013));
        System.out.println(minDistance(8));
    }
}
