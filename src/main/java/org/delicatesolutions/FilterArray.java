package org.delicatesolutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Question
 * A binary representation of a number can be used to select elements from an array. For example,
 * n: array: indexes selected result
 * 88 = 23 + 24 + 26 (1011000) 8, 4, 9, 0, 3, 1, 2
 * 0 1 2 3 4 5 6
 * * * * 0, 3, 2
 * so the result of filtering {8, 4, 9, 0, 3, 1, 2} using 88 would be {0, 3, 2}
 * In the above, the elements that are selected are those whose indices are used as exponents in the binary
 * representation of 88. In other words, a[3], a[4], and a[6] are selected for the result because 3, 4 and 6 are the
 * powers of 2 that sum to 88.
 * Write a method named filterArray that takes an array and a non-negative integer and returns the result of filtering
 * the array using the binary representation of the integer. The returned array must big enough to contain the filtered
 * elements and no bigger. So in the above example, the returned array has length of 3, not 7 (which is the size of the
 * original array.) Futhermore, if the input array is not big enough to contain all the selected elements, then the
 * method returns null. For example, if n=3 is used to filter the array a = {18}, the method should return null because
 * 3=20+21 and hence requires that the array have at least 2 elements a[0] and a[1], but there is no a[1].
 * If you are using Java or C#, the signature of the function is int[ ] filterArray(int[ ] a, int n)If you are using C
 * or C++, the signature of the function is
 * int * filterArray(int a[ ], int len, int n) where len is the length of the array a Hint: Proceed as follows
 * a. Compute the size of the returned array by counting the number of 1s in the binary representation of n
 * (You can use modulo 2 arithmetic to determine the 1s in the binary represention of n)
 * b. Allocate an array of the required size
 * c. Fill the allocated array with elements selected from the input array* Examples
 * Examples
 * if a is               and n is    return         because
 * {9, -9}                  0           {}          because there are no 1s in the binary representation of 0
 * {9, -9}                  1           {9}         because 1 = 20 and a[0] is 9
 * {9, -9}                  2           {-9}        because 2 = 21 and a[1] is -9
 * {9, -9}                  3           {9, -9}     because 3 = 20 + 21 and a[0]=9, a[1]=-9
 * {9, -9}                  4           null        because 4 = 22 and there is no a[2]
 * {9, -9, 5}               3           {9, -9}     because 3 = 20 + 21 and a[0]=9, a[1]=-9
 * {0, 9, 12, 18, -6}       11          {0, 9, 18}  because 11 = 20 + 21 + 23 and a[0]=0, a[1]=9, a[3]=18
 */
/*

 */
public class FilterArray {
    public static int[] filterArray(int[] a, int n) {
        //with array list
        // Compute the size of the returned array
//        int size = 0;
//        int temp = n;

//        List<Integer> indexList = new ArrayList<>();
//        int index = 0;
//        while (temp > 0) {
//            if (temp % 2 == 1) {
//                size++;
//                indexList.add(index);
//            }
//            temp /= 2;
//            index++;
//        }
//
//        if (a.length <= --index) {
//            return null;
//        }
//        int[] result = new int[size];
//
//        for (int i = 0; i < result.length; i++) {
//            result[i] = a[indexList.get(i)];
//        }



        //without arrayList
        int size = 0;
        int temp = n;
        StringBuilder createIndex = new StringBuilder("-1");

        int index = 0;
        while (temp > 0) {
            if (temp % 2 == 1) {
                size++;
                createIndex.append(",").append(index);
            }
            temp /= 2;
            index++;
        }

        String foundIndex = createIndex.toString();
        String[] foundItems  = foundIndex.split(",");
        int[] foundArray = new int[size];
        int foundI=0;
        for (String foundItem : foundItems) {
            if (!foundItem.equals("-1")) {
                foundArray[foundI++] = Integer.parseInt(foundItem);
            }
        }

        if (a.length <= --index) {
            return null;
        }
        int[] result = new int[size];
        for (int i = 0; i < result.length; i++) {
            result[i] = a[foundArray[i]];
        }


        return result;

    }

    public static void main(String[] args) {
        int[] array1 ={9, -9};
        int[] array2 ={9, -9};
        int[] array3 ={9, -9};
        int[] array4 ={9, -9};
        int[] array5 ={9, -9};
        int[] array6 ={9, -9, 5};
        int[] array7 ={0, 9, 12, 18, -6};

        System.out.println(Arrays.toString(filterArray(array1,0)));//{}
        System.out.println(Arrays.toString(filterArray(array2,1)));//{9}
        System.out.println(Arrays.toString(filterArray(array3,2)));//{-9}
        System.out.println(Arrays.toString(filterArray(array4,3)));//{9, -9}
        System.out.println(Arrays.toString(filterArray(array5,4)));//null
        System.out.println(Arrays.toString(filterArray(array6,3)));//{9, -9}
        System.out.println(Arrays.toString(filterArray(array7,11)));//{0, 9, 18}

    }


}
