package org.delicatesolutions;

/*
Define a Dual array to be an array where every value occurs exactly twice. For example, {1, 2, 1, 3, 3, 2} is a dual array.
The following arrays are not Dual arrays
{2, 5, 2, 5, 5} (5 occurs three times instead of two times)
{3, 1, 1, 2, 2} (3 occurs once instead of two times)
Write a function named isDual that returns 1 if its array argument is a Dual array. Otherwise it returns 0.
If you are programming in Java or C#, the function signature is
int isDual (int[ ] a)
If you are programming in C or C++, the function signature is
int isDual (int a[ ], int len) where len is the number of elements in the array.
 */
public class IsDual {
    public static int isDual(int[] a) {
        if (a.length % 2 != 0) {
            return 0;
        }
        int counter;
        boolean[] visited = new boolean[a.length];
        int pairs = 0;
        for (int i = 0; i < a.length; i++) {
            if (visited[i]) {
                continue;
            }
            counter = 1;
            for (int j = i + 1; j < a.length; j++) {
                if (!visited[j] && a[i] == a[j]) {
                    visited[j] = true;
                    counter++;
                }
            }
            visited[i] = true;
            if (counter != 2) {
                return 0;
            }

            pairs++;
        }
        return pairs == a.length / 2 ? 1 : 0;
    }

    public static void main(String[] args) {
        System.out.println(isDual(new int[]{1, 2, 1, 3, 3, 2}));
        System.out.println(isDual(new int[]{2, 5, 2, 5, 5}));
        System.out.println(isDual(new int[]{3, 1, 1, 2, 2}));
    }
}
