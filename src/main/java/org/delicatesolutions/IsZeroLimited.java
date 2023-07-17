package org.delicatesolutions;

/*
An array, a, is called zero-limited if the following two conditions hold:
i. a[3*n+1] is 0 for n>=0 where 3*n+1 is less than the number of elements in the array. ii. if i != 3*n+1 for some n, then a[i] does not equal 0
For example, {1, 0, 5, -1, 0, 2, 3, 0, 8} is zero-limited because
a[3*0+1] = 0, a[3*1+1] = 0 and a[3*2+1] = 0 and all other elements are non-zero.
Write a function named isZeroLimited that returns 1 if its array argument is zero-limited, else it returns 0.
If you are programming in Java or C#, the function signature is
int isZeroLimited(int[ ] a)
If you are programming in C or C++, the function signature is
int isZeroLimited(int a[ ], int len) where len is the number of elements in a.
Examples
if a is                         return  reason
{0, 0, 0, 0, 0}                     0   Only a[1] and a[4] can be 0
{1, 0}                              1   a[1] is 0, all other elements are non-zero
{0, 1}                              0   a[1] must be 0 (and a[0] cannot be 0)
{5}                                 1   Note, because the length of the array is 1, there can be no zero values, since the first one would occur at a[1]
{1, 0, 1, 1, 0, 1, 1, 0, 1, 1, 0}   1   Elements a[1], a[4], a[7] and a[10] are 0 and all others are non zero
{}                                  1   Since there are no elements, none can fail the condition.
The best answers will make only one pass through the array, i.e, will have only one loop.
 */
public class IsZeroLimited {
    public static int isZeroLimited(int[] a) {
        int n = 0;
        for (int i = 0; i < a.length; i++) {
            if (i == 3 * n + 1) {
                if (a[i] != 0) {
                    return 0;
                }
                n++;
            } else {
                if (a[i] == 0) {
                    return 0;
                }
            }
        }
        return 1;
    }

    public static void main(String[] args){
        System.out.println(isZeroLimited(new int[]{0, 0, 0, 0, 0}));
        System.out.println(isZeroLimited(new int[]{1, 0}));
        System.out.println(isZeroLimited(new int[]{0,1}));
        System.out.println(isZeroLimited(new int[]{5}));
        System.out.println(isZeroLimited(new int[]{1, 0, 1, 1, 0, 1, 1, 0, 1, 1, 0}));
        System.out.println(isZeroLimited(new int[]{}));
    }
}
