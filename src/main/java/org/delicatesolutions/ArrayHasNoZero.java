package org.delicatesolutions;

/*
Write a function that will return 1 if all the element are non-zero. Otherwise return 0.
int arrayHasNoZero(int[] a)

{1,2,3}     1
{1,0,4,0}   0
{1,2,3,0}   0
{0,0,0,0}   0
{}          1
 */
public class ArrayHasNoZero {
    public static int arrayHasNoZero(int[] a) {
        for (int n : a) {
            if (n == 0){
                return n;
            }
        }
        return 1;
    }

    public static void main(String[] args){
        System.out.println(arrayHasNoZero(new int[]{1,2,3}));
        System.out.println(arrayHasNoZero(new int[]{1,0,4,0}));
        System.out.println(arrayHasNoZero(new int[]{1,2,3,0}));
        System.out.println(arrayHasNoZero(new int[]{0,0,0,0}));
        System.out.println(arrayHasNoZero(new int[]{}));
    }
}
