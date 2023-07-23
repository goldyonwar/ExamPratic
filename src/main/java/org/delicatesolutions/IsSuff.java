package org.delicatesolutions;
/*
A Suff array is defined to be an array where for every value n in the array, there is also an element n-1 or n+1 in the array.
For example, {2, 10, 9, 3} is a Suff array because 2 = 3-1
10 = 9+1 3=2+1 9 = 10 -1
Other Suff arrays include {2, 2, 3, 3, 3}, {1, 1, 1, 2, 1, 1} and {0, -1, 1}.
The array {3, 4, 5, 7} is not a Suff array because of the value 7 which requires that the array contains either the value 6 (7-1) or 8 (7+1) but neither of these values are in the array.
Write a function named isSuff that returns 1 if its array argument is a Suff array. Otherwise it returns a 0.
If you are programming in Java or C#, the function signature is int isSuff (int[ ] a)
If you are programming in C or C++, the function signature is
int isSuff (int a[ ], int len) where len is the number of elements in the array.
 */
public class IsSuff {
    //@See IsBean2
}