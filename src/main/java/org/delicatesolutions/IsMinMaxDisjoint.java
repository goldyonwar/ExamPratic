package org.delicatesolutions;

/*
An array is defined to be minmax-disjoint if the following conditions hold:
a. The minimum and maximum values of the array are not equal.
b. The minimum and maximum values of the array are not adjacent to one another.
c. The minimum value occurs exactly once in the array.
d. The maximum value occurs exactly once in the array.
For example the array {5, 4, 1, 3, 2} is minmax-disjoint because
a. The maximum value is 5 and the minimum value is 1 and they are not equal. b. 5 and 1 are not adjacent to one another
c. 5 occurs exactly once in the array
d. 2 occurs exactly once in the array
Write a function named isMinMaxDisjoint that returns 1 if its array argument is minmax-disjoint, otherwise it returns 0.
If you are programming in Java or C#, the function signature is int isMinMaxDisjoint(int[ ] a)
If you are programming in C or C#, the function signature is
int isMinMaxDisjoint(int a[ ], int len) where len is the number of elements in the array.
Examples of arrays that are not minMaxDisjoint

if a is return
{18, -1, 3, 4, 0} 0
{9, 0, 5, 9} 0
{0, 5, 18, 0, 9| 0
{7, 7, 7, 7} 0
{} 0 {1, 2} 0
{1} 0
Reason
The max and min values are adjacent to one another.
The max value occurs twice in the array.
The min value occurs twice in the array.
The min and the max value must be different.
There is no min or max.
The min and max elements are next to one another.
The min and the max are the same.
 */
public class IsMinMaxDisjoint {
    public static int isMinMaxDisjoint(int[] a) {
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE, maxCount = 0, minCount = 0, minPost = -1, maxPost = -2, currentPost;
        for (int i = 0; i < a.length; i++) {
            currentPost = a[i];
            if (max < currentPost) {
                max = currentPost;
                maxCount = 1;
                maxPost = i;
            } else {
                if (max == currentPost) {
                    maxCount++;
                }
            }
            if (min > currentPost) {
                min = currentPost;
                minCount = 1;
                minPost = i;
            } else {
                if (min == currentPost) {
                    minCount++;
                }
            }

        }
        if (max == min || minCount > 1 || maxCount > 1 || (maxPost + 1 == minPost || maxPost - 1 == minPost)) {
            return 0;
        }
        return 1;
    }

    public static void main(String[] args){
        System.out.println(isMinMaxDisjoint(new int[]{5, 4, 1, 3, 2}));
        System.out.println(isMinMaxDisjoint(new int[]{18, -1, 3, 4, 0}));
        System.out.println(isMinMaxDisjoint(new int[]{9, 0, 5, 9}));
        System.out.println(isMinMaxDisjoint(new int[]{0, 5, 18, 0, 9}));
        System.out.println(isMinMaxDisjoint(new int[]{7, 7, 7, 7}));
        System.out.println(isMinMaxDisjoint(new int[]{}));
        System.out.println(isMinMaxDisjoint(new int[]{1}));
        System.out.println(isMinMaxDisjoint(new int[]{1,2}));
    }
}
