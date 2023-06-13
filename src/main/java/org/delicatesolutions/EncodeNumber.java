package org.delicatesolutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EncodeNumber {
    public static int[] encodeNumber(int n){
        if (n <= 1){
            return null;
        }

        int calculator = n;
        List<Integer> resultList = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)){
                while (calculator % i == 0){
                    resultList.add(i);
                    calculator /= i;
                }
            }
        }


        int[] result = new int[resultList.size()];

        for (int i = 0; i < resultList.size(); i++) {
            result[i] = resultList.get(i);
        }

        return result;
    }

    private static  boolean isPrime(int number){
        for (int i = 2; i < number / 2; i++) {
            if (number % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        System.out.println(Arrays.toString(encodeNumber(2)));   //{2}
        System.out.println(Arrays.toString(encodeNumber(6)));   //{2, 3}
        System.out.println(Arrays.toString(encodeNumber(14)));  //{2, 7}
        System.out.println(Arrays.toString(encodeNumber(24)));  //{2, 2, 2, 3}
        System.out.println(Arrays.toString(encodeNumber(1200)));//{2, 2, 2, 2, 3, 5, 5}
        System.out.println(Arrays.toString(encodeNumber(1)));   //null
        System.out.println(Arrays.toString(encodeNumber(-8)));  //null
    }
}
