package org.delicatesolutions;

import java.util.Arrays;
/*
A mileage counter is used to measure mileage in an automobile. A mileage counter looks something like this
05998
The above mileage counter says that the car has travelled 5,998 miles. Each mile travelled by the automobile increments the mileage counter. Here is how the above mileage counter changes over a 3 mile drive.
After the first mile
05999
After the second mile
06000
After the third mile
06001
A mileage counter can be represented as an array. The mileage counter
05998
can be represented as the array
int a[ ] = new int[ ] {8, 9, 9, 5, 0}
Note that the mileage counter is "backwards" in the array, a[0] represents ones, a[1] represents tens, a[2] represents hundreds, etc.
Write a function named updateMileage that takes an array representation of a mileage counter (which can be arbitrarily long) and adds a given number of miles to the array. Since arrays are passed by reference you can update the array in the function, you do not have to return the updated array.
You do not have to do any error checking. You may assume that the array contains non-negative digits and that the mileage is non-negative
If you are programming in Java or C#, the function signature is void updateMileage counter(int[ ] a, int miles)
If you are programming in C or C++, the function signature is
void updateMileage counter(int a[ ], int miles, int len) where len is the number of elements in the array
Examples:
if the input array is
{8, 9, 9, 5, 0}
{8, 9, 9, 5, 0}
{9, 9, 9, 9, 9, 9, 9, 9, 9, 9} {9, 9, 9, 9, 9, 9, 9, 9, 9, 9}
and the mileage is
1 2 1 13
the array becomes
{9, 9, 9, 5, 0}
{0, 0, 0, 6, 0}
{0, 0, 0, 0, 0, 0, 0, 0, 0, 0} {2, 1, 0, 0, 0, 0, 0, 0, 0, 0}
Note that the mileage counter wraps around if it reaches all 9s and there is still some mileage to add.
Hint: Write a helper function that adds 1 to the mileage counter and call the helper function once for each mile Copy and paste your answer here and click the "Submit answer" button

 */
public class UpdateMileageCounter {
    public static void updateMileageCounter(int[] a, int miles) {
        for (int i = 1; i <= miles; i++) {
            incrementMileageCounter(a);
        }
    }

    private static void incrementMileageCounter(int[] a) {
        int carry = 1;
        for (int i = 0; i < a.length; i++) {
            int sum = a[i] + carry;
            a[i] = sum % 10;
            carry = sum / 10;
            if (carry == 0) {
                break;  // No need to continue if there is no more carry
            }
        }
    }
    public static void main(String[] args) {
        int[] a1= new int[]{8, 9, 9, 5, 0};
        int[] a2= new int[]{8, 9, 9, 5, 0};
        int[] a3= new int[]{9, 9, 9, 9, 9, 9, 9, 9, 9, 9};
        int[] a4= new int[]{9, 9, 9, 9, 9, 9, 9, 9, 9, 9};
        updateMileageCounter(a1,1);
        updateMileageCounter(a2,2);
        updateMileageCounter(a3,1);
        updateMileageCounter(a4,13);
        System.out.println(Arrays.toString(a1));
        System.out.println(Arrays.toString(a2));
        System.out.println(Arrays.toString(a3));
        System.out.println(Arrays.toString(a4));

    }

}
