package org.delicatesolutions;

/*
An array is defined to be odd-valent if it meets the following two conditions: a. It contains a value that occurs more than once
b. It contains an odd number
For example {9, 3, 4, 9, 1} is odd-valent because 9 appears more than once and 3 is odd. Other odd- valent arrays are {3, 3, 3, 3} and {8, 8, 8, 4, 4, 7, 2}
The following arrays are not odd-valent:
{1, 2, 3, 4, 5}  no value appears more than once.
{2, 2, 2, 4, 4}  there are duplicate values but there is no odd value.
Write a function name isOddValent that returns 1 if its array argument is odd-valent, otherwise it returns 0.
If you are programming in Java or C#, the function prototype is int isOddValent (int[ ] a);
If you are programming in C or C++, the function prototype is
int isOddValent (int a[ ], int len) where len is the number of elements in the array.

 */
public class IsOddValent {
    public static int isOddValent(int[] a) {
        boolean hasOdd = false, moreThanTwoValue = false;
        for (int i = 0; i < a.length; i++) {
            if (hasOdd && moreThanTwoValue) {
                break;
            }
            if (a[i] % 2 != 0) {
                hasOdd = true;
            }
            if (!moreThanTwoValue) {
                for (int j = 0; j < a.length; j++) {
                    if (i != j) {
                        if (a[i] == a[j]) {
                            moreThanTwoValue = true;
                        }
                    }
                }
            }
        }

        if (hasOdd && moreThanTwoValue) {
            return 1;
        }

        return 0;
    }

    public static void main(String[] args) {
        System.out.println(isOddValent(new int[]{9, 3, 4, 9, 1}));
        System.out.println(isOddValent(new int[]{3, 3, 3, 3}));
        System.out.println(isOddValent(new int[]{8, 8, 8, 4, 4, 7, 2}));
        System.out.println(isOddValent(new int[]{1, 2, 3, 4, 5}));
        System.out.println(isOddValent(new int[]{2, 2, 2, 4, 4}));
    }
}
