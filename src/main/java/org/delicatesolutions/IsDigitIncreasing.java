package org.delicatesolutions;

/**
 * A number is called digit-increasing if it is equal to n + nn + nnn + ... for some digit n between 1 and 9.
 * For example 24 is digit- increasing because it equals 2 + 22 (here n = 2)
 * Write a function called isDigitIncreasing that returns 1 if its argument is digit-increasing otherwise,
 * it returns 0. The signature of the method is
 * int isDigitIncreasing(int n) Examples
 * if n is          then function returns       reason
 * 7                1                           because 7 = 7 (here n is 7)
 * 36               1                           because 36 = 3 + 33
 * 984              1                           because 984 = 8 + 88 + 888
 * 7404             1                           because 7404 = 6 + 66 + 666 + 6666
 */
public class IsDigitIncreasing {
    public static int isDigitIncreasing(int n) {

        int worker = n;
        int counter = 0;
        while (worker > 0) {
            counter++;
            worker = worker / 10;
        }


        int result;
        for (int i = 1; i <= 9; i++) {
            result = 0;
            for (int j = 1; j <= counter; j++) {
                result = result * 10 + i*j;
            }
            if (result == n) {
                return 1;
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        System.out.println(isDigitIncreasing(7));
        System.out.println(isDigitIncreasing(36));
        System.out.println(isDigitIncreasing(984));
        System.out.println(isDigitIncreasing(7404));
    }
}
