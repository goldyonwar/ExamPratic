package org.delicatesolutions;

/**
 * An onion array is an array that satisfies the following condition for all values of j and k: if j>=0 and k>=0 and
 * j+k=length of array and j!=k then a[j]+a[k] <= 10
 * Write a function named isOnionArray that returns 1 if its array argument is an onion array and returns 0 if it is not.
 * Your solution must not use a nested loop (i.e., a loop executed from inside another loop). Furthermore, once you
 * determine that the array is not an onion array your function must return 0; no wasted loops cycles please!
 * If you are programming in Java or C#, the function signature is int isOnionArray(int[ ] a)
 * If you are programming in C or C++, the function signature is
 * int isOnionArray(int a[], int len) where len is the number of elements in the array a.
 *
 * Examples
 * a is                 then function           reason returns
 * {1, 2, 19, 4, 5}     1                       because 1+5 <= 10, 2+4 <=10
 * {1, 2, 3, 4, 15}     0                       because 1+15 > 10
 * {1, 3, 9, 8}         0                       because 3+9 > 10
 * {2}                  1                       because there is no j, k where a[j]+a[k] > 10 and j+k=length of array and j!=k
 * {}                   1                       because there is no j, k where a[j]+a[k] > 10 and j+k=length of array and j!=k
 * {-2, 5, 0, 5, 12}    1                       because -2+12 <= 10 and 5+5 <= 10
 *
 */
/*
    Just check the example .... ignore "j+k=length"
 */
public class IsOnionArray {
    public static int isOnionArray(int[] a){
        for (int i = 0; i < a.length / 2; i++) {
            if (a[i] + a[a.length - i - 1] > 10) {
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 19, 4, 5};
        int[] arr2 = {1, 2, 3, 4, 15};
        int[] arr3 = {1, 3, 9, 8};
        int[] arr4 = {2};
        int[] arr5 = {};
        int[] arr6 = {-2, 5, 0, 5, 12};

        System.out.println(isOnionArray(arr1)); // Output: 1
        System.out.println(isOnionArray(arr2)); // Output: 0
        System.out.println(isOnionArray(arr3)); // Output: 0
        System.out.println(isOnionArray(arr4)); // Output: 1
        System.out.println(isOnionArray(arr5)); // Output: 1
        System.out.println(isOnionArray(arr6)); // Output: 1
    }
}
