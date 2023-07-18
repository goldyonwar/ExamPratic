package org.delicatesolutions;

/*
An array is defined to be a Bean array if it meets the following conditions a. If it contains a 9 then it also contains a 13.
b. If it contains a 7 then it does not contain a 16.
So{1,2,3,9,6,13} and{3,4,6,7,13,15},{1,2,3,4,10,11,12}and{3,6,9,5,7,13,6,17}are Bean arrays.
The following arrays are not Bean arrays:
a. { 9, 6, 18} (contains a 9 but no 13)
b. {4, 7, 16} (contains both a 7 and a 16)
Write a function named isBean that returns 1 if its array argument is a Bean array, otherwise it returns 0.
If you are programming in Java or C#, the function signature is int isBean (int[ ] a)
If you are programming in C or C++, the function signature is
int isBean (int a[ ], int len) where len is the number of elements in the array.
 */
public class IsBean {
    public static int isBean(int[] a){
        boolean isIncludeNine = false, isIncludeThirteen = false, isIncludeSeven = false, isIncludeSixteen = false;
        for (int j : a) {
            if (j == 9) {
                isIncludeNine = true;
            }
            if (j == 13) {
                isIncludeThirteen = true;
            }
            if (j == 7) {
                isIncludeSeven = true;
            }
            if (j == 16) {
                isIncludeSixteen = true;
            }
        }
        if (isIncludeNine && !isIncludeThirteen) {
            return 0;
        }

        if (isIncludeSeven && isIncludeSixteen) {
            return 0;
        }

        return 1;
    }

    public static void main(String[] args){
        System.out.println(isBean(new int[]{1,2,3,9,6,13}));
        System.out.println(isBean(new int[]{3,4,6,7,13,15}));
        System.out.println(isBean(new int[]{1,2,3,4,10,11,12}));
        System.out.println(isBean(new int[]{3,6,9,5,7,13,6,17}));
        System.out.println(isBean(new int[]{9, 6, 18}));
        System.out.println(isBean(new int[]{4, 7, 16}));
    }
}
