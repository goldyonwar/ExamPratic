package org.delicatesolutions;

/**
 * An array is called systematically increasing if it consists of increasing sequences of the numbers from 1 to n.
 * The first six (there are over 65,000 of them) systematically increasing arrays are:
 * {1}
 * {1, 1, 2}
 * {1, 1, 2, 1, 2, 3}
 * {1, 1, 2, 1, 2, 3, 1, 2, 3, 4}
 * {1, 1, 2, 1, 2, 3, 1, 2, 3, 4, 1, 2, 3, 4, 5}
 * {1, 1, 2, 1, 2, 3, 1, 2, 3, 4, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 6}
 * Write a function named isSystematicallyIncreasing which returns 1 if its array argument is systematically
 * increasing. Otherwise it returns 0.
 * If you are programming in Java or C#, the function signature is int isSystematicallyIncreasing(int[ ] a)
 * If you are programming in C or C++, the function signature is int isSystematicallyIncreasing(int a[ ],int len)
 * where len is the number of elements in the array a.
 * Examples
 * a is                 then function returns           reason
 * {1}                      1                           because 1 is a sequence from 1 to 1 and is the only sequence.
 * {1, 2, 1, 2, 3}          0                           because it is missing the sequence from 1 to 1.
 * {1, 1, 3}                0                           because {1, 3} is not a sequence from 1 to n for any n.
 * {1, 2, 1, 2, 1, 2}       0                           because it contains more than one sequence from 1 to 2.
 * {1, 2, 3, 1, 2, 1}       0                           because it is "backwards", i.e., the sequences from 1 to n are not ordered by increasing value of n
 * {1, 1, 2, 3}             0                           because the sequence {1, 2} is missing (it should precede {1, 2, 3})
 */
public class IsSystematicallyIncreasing {

    public static int isSystematicallyIncreasing(int[] a) {
        int endIndex = 1, checker = 1, counter = 1;
        int index = 0;
        while (index < a.length) {
            for (; index < endIndex; index++) {
                if (a[index] != checker) {
                    return 0;
                }
                checker++;
            }
            counter++;
            endIndex = counter + index;
            checker = 1;
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(isSystematicallyIncreasing(new int[]{1}));
        System.out.println(isSystematicallyIncreasing(new int[]{1, 2, 1, 2, 3}));
        System.out.println(isSystematicallyIncreasing(new int[]{1, 1, 3}));
        System.out.println(isSystematicallyIncreasing(new int[]{1, 2, 1, 2, 1, 2}));
        System.out.println(isSystematicallyIncreasing(new int[]{1, 2, 3, 1, 2, 1}));
        System.out.println(isSystematicallyIncreasing(new int[]{1, 1, 2, 3}));
        System.out.println(isSystematicallyIncreasing(new int[]{1, 1, 2, 1, 2, 3, 1, 2, 3, 4, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 6}));
    }
}
