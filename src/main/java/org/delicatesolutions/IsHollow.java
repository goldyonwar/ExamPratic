package org.delicatesolutions;

/*
An array is said to be hollow if it contains 3 or more zeros in the middle that are preceded and followed by the same
number of non-zero elements. Furthermore, all the zeroes in the array must be in the middle of the array.
Write a function named isHollow that accepts an integer array and returns 1 if it is a hollow array,
otherwise it returns 0.
If you are programming in Java or C#, the function signature is int isHollow(int[ ] a)
If you are programming in C or C++, the function signature is
int isHollow(int a[ ], int len) where len is the number of elements in the array
Examples:
if the input array is           is hollow?      reason
{1,2,0,0,0,3,4}                 yes             2 non-zeros precede and follow 3 zeros in the middle
{1,1,1,1,0,0,0,0,0,2,1,2,18}    yes             4 non-zeros precede and follow the 5 zeros in the middle
{1, 2, 0, 0, 3, 4}              no              There are only 2 zeroes in the middle; at least 3 are required
{1,2,0,0,0,3,4,5}               no              The number of preceding non-zeros(2) is not equal to the number of following non-zeros(3)
{3,8,3,0,0,0,3,3}               no              The number of preceding non-zeros(3) is not equal to the number of following non-zeros(2)
{1,2,0,0,0,3,4,0}               no              Not all zeros are in the middle
{0,1,2,0,0,0,3,4}               no              Not all zeros are in the middle
{0,0,0}                         yes             The number of preceding non-zeros is 0 which equals the number of following non-zeros. And there are three zeros "in the middle".

Hint: Write three loops. The first counts the number of preceding non-zeros.
The second counts the number of zeros in the middle.
The third counts the number of following non-zeros. Then analyze the results.
 */
public class IsHollow {
    public static int isHollow(int[] a) {
        int len = a.length;
        int nonZerosBefore = 0;
        int zeros = 0;
        int nonZerosAfter = 0;

        // Count non-zeros before the zeros
        int i = 0;
        while (i < len && a[i] != 0) {
            nonZerosBefore++;
            i++;
        }

        // Count zeros in the middle
        while (i < len && a[i] == 0) {
            zeros++;
            i++;
        }

        // Count non-zeros after the zeros
        while (i < len && a[i] != 0) {
            nonZerosAfter++;
            i++;
        }

        // Check if it is a hollow array
        return (zeros >= 3 && nonZerosBefore == nonZerosAfter && i == len) ? 1 : 0;
    }


    public static void main(String[] args) {
        System.out.println(isHollow(new int[]{1, 2, 0, 0, 0, 3, 4}));
        System.out.println(isHollow(new int[]{1, 1, 1, 1, 0, 0, 0, 0, 0, 2, 1, 2, 18}));
        System.out.println(isHollow(new int[]{1, 2, 0, 0, 3, 4}));
        System.out.println(isHollow(new int[]{1, 2, 0, 0, 0, 3, 4, 5}));
        System.out.println(isHollow(new int[]{3, 8, 3, 0, 0, 0, 3, 3}));
        System.out.println(isHollow(new int[]{1, 2, 0, 0, 0, 3, 4, 0}));
        System.out.println(isHollow(new int[]{0, 1, 2, 0, 0, 0, 3, 4}));
        System.out.println(isHollow(new int[]{0, 0, 0}));
    }
}
