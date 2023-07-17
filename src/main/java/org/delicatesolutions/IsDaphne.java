package org.delicatesolutions;

/*
A Daphne array is an array that contains either all odd numbers or all even numbers.
For example, {2, 4, 2} (only even numbers) and {1, 3, 17, 5} (only odd numbers) are Daphne arrays
but {3, 2, 5} is not because it contains both odd and even numbers. Write a function named isDaphne that returns 1
if its array argument is a Daphne array. Otherwise it returns 0.
If you are programming in Java or C#, the function prototype is int isDaphne (int[ ] a);
If you are programming in C or C++, the function prototype is
int isDaphne (int a[ ], int len) where len is the number of elements in the array.
 */
public class IsDaphne {
    public static  int isDaphne(int[] a){
        boolean isEven =false;
        for (int i = 0; i < a.length; i++) {
            if (i == 0){
                isEven = a[i]%2==0;
            }else {
                if (isEven != (a[i] % 2 == 0)){
                    return 0;
                }
            }
        }
        return 1;
    }

    public static void main(String[] args){
        System.out.println(isDaphne(new int[]{2,4,2}));
        System.out.println(isDaphne(new int[]{1, 3, 17, 5}));
        System.out.println(isDaphne(new int[]{3, 2, 5}));
    }
}
