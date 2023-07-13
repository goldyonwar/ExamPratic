package org.delicatesolutions;

/*
 Define an array to be one-balanced if begins with zero or more 1s followed by zero or more non-1s and concludes with
 zero or more 1s. Write a function named isOneBalanced that returns 1 if its array argument is one-balanced, otherwise
 it returns 0.
If you are programming in int isOneBalanced(int[ ] a)
If you are programming in int isOneBalanced(int a[ ],
Examples
if a is                     then function returns   reason
{1,1,1,2,3,-18,45,1}        1                       because it begins with three 1s, followed by four non-1s and
                                                    ends with one 1 and 3+1 == 4
{1,1,1,2,3,-18,45,1,0}      0                       because the 0 starts another sequence of non-1s. There can be
                                                    only one sequence of non-1s.
{1, 1, 2, 3, 1, -18, 26, 1} 0                       because there are two sequences of non-1s ({2, 3} and {-18, 26}
{}                          1                       because 0 (# of beginning 1s) + 0 (# of ending 1s) = 0 (# of non-1s)
{3, 4, 1, 1}                1                       because 0 (# of beginning 1s) + 2 (# of ending 1s) = 2 (# of non-1s)
{1, 1, 3, 4}                1                       because 2 (# of beginning 1s) + 0 (# of ending 1s) = 2 (# of non-1s)
{3, 3, 3, 3, 3, 3}          0                       because 0 (# of beginning 1s) + 0 (# of ending 1s) != 6 (# of non-1s)
{1, 1, 1, 1, 1, 1}          0                       because 6 (# of beginning 1s) + 0 (# of ending 1s) != 0 (# of non-1s)
3. The Fibonacci sequence = ni-2 + ni-1, e.g., 34 = 13 +
Java or C#, the function signature is
C or C++, the function signature is
int len) where len is the number of elements in the array a.
 */
public class IsOneBalanced {
    public static int isOneBalanced(int[] a) {
        int beginning = 0, ending = 0, nonZero = 0, tailChecker = a.length - 1;
        boolean isBeginningDone = false, isEndingDone = false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != 1) {
                nonZero++;
            }

            if (!isBeginningDone) {
                if (i == 0) {
                    if (a[i] == 1) {
                        beginning++;
                    } else {
                        isBeginningDone = true;
                    }
                } else if (a[i - 1] == 1 && a[i] == 1) {
                    beginning++;
                } else {
                    isBeginningDone = true;
                }
            }

            if (!isEndingDone) {
                if ((tailChecker - i) == tailChecker) {
                    if (a[tailChecker - i] == 1) {
                        ending++;
                    } else {
                        isEndingDone = true;
                    }
                } else if (a[(tailChecker - (i - 1))] == 1 && a[tailChecker - i] == 1) {
                    ending++;
                } else {
                    isEndingDone = true;
                }
            }
        }


        if (beginning + ending == nonZero) {
            return 1;
        }

        return 0;
    }

    public static void main(String[] args) {
        System.out.println(isOneBalanced(new int[]{1, 1, 1, 2, 3, -18, 45, 1}));
        System.out.println(isOneBalanced(new int[]{1, 1, 1, 2, 3, -18, 45, 1, 0}));
        System.out.println(isOneBalanced(new int[]{1, 1, 2, 3, 1, -18, 26, 1}));
        System.out.println(isOneBalanced(new int[]{}));
        System.out.println(isOneBalanced(new int[]{3, 4, 1, 1}));
        System.out.println(isOneBalanced(new int[]{1, 1, 3, 4}));
        System.out.println(isOneBalanced(new int[]{3, 3, 3, 3, 3, 3}));
        System.out.println(isOneBalanced(new int[]{1, 1, 1, 1, 1, 1}));

    }
}
