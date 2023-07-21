package org.delicatesolutions;

/*
An array is defined to be odd-heavy if it contains at least one odd element and every odd element is greater than every even element.
So {11, 4, 9, 2, 8} is odd- heavy because the two odd elements (11 and 9) are greater than all the even elements. And {11, 4, 9, 2, 3, 10}
 is not odd-heavy because the even element 10 is greater than the odd element 9.
 Write a function called isOddHeavy that accepts an integer array and returns 1 if the array is odd-heavy;
 otherwise it returns 0. Some other examples:
 {1} is odd-heavy,
 {2} is not odd-heavy,
 {1, 1, 1, 1} is odd-heavy,
 {2, 4, 6, 8, 11} is odd-heavy,
 {-2, -4, -6, -8, -11} is not odd-heavy.
If you are programming in Java or C#, the function signature is int isOddHeavy(int[ ] a)
If you are programming in C or C++, the function signature is int isOddHeavy(int a[ ], int len)
where len is the number of elements in the array.
 */
public class IsOddHeavy {
    public static int isOddHeavy(int[] a) {
        int oddCount = 0, evenCount = 0;
        sort(a);
        int[] oddArray = new int[a.length], evenArray = new int[a.length];
        for (int j : a) {
            if (j < 0) {
                return 0;
            }
            if (j % 2 == 0) {
                evenArray[evenCount++] = j;
            } else {
                oddArray[oddCount++] = j;
            }
        }

        if (oddCount == 0){
            return 0;
        }
        if (evenCount == 0){
            return 1;
        }

        if (evenArray[evenCount-1]< oddArray[0]){
            return 1;
        }

        return 0;
    }

    public static void sort(int[] a){
        int handler, size = a.length-1;
        boolean isExchange;
        for (int i = 0; i < size; i++) {
            isExchange = false;
            for (int j = 0; j < size; j++) {
                if (a[j]> a[j+1]){
                    handler = a[j];
                    a[j] = a[j+1];
                    a[j+1] = handler;
                    isExchange = true;
                }
            }
            if (!isExchange){
                break;
            }
        }
    }

    public static void main(String[] args){
        System.out.println(isOddHeavy(new int[]{11, 4, 9, 2, 8}));
        System.out.println(isOddHeavy(new int[]{1}));
        System.out.println(isOddHeavy(new int[]{2}));
        System.out.println(isOddHeavy(new int[]{1,1,1,1}));
        System.out.println(isOddHeavy(new int[]{2, 4, 6, 8, 11}));
        System.out.println(isOddHeavy(new int[]{-2, -4, -6, -8, -11}));
    }
}
