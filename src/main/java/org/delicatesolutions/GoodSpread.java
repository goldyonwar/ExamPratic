package org.delicatesolutions;

/*
Write a function called goodSpread that returns 1 if no value in its array argument occurs more than 3 times in the array.
For example, goodSpread(new int[] {2, 1, 2, 5, 2, 1, 5, 9} returns 1 because no value occurs more than three times.
But goodSpread(new int[ ] {3, 1, 3 ,1, 3, 5, 5, 3} ) returns 0 because the value 3 occurs four times.
If you are writing in Java or C#, the function signature is
int goodSpread (int[ ] a)
If you are writing in C or C++, the function signature is
int goodSpread (int a[ ], int len) where len is the number of elements in the array.
 */
public class GoodSpread {
    public static int goodSpread(int[] a) {
        if (a == null || a.length < 1) {
            return 0;
        }

        int counter;
        boolean[] visited = new boolean[a.length];

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
            if (counter > 3) {
                return 0;
            }
        }

        return 1;
    }

    public static void main(String[] args){
        System.out.println(goodSpread(null));
        System.out.println(goodSpread(new int[]{}));
        System.out.println(goodSpread(new int[]{2, 1, 2, 5, 2, 1, 5, 9}));
        System.out.println(goodSpread(new int[]{3, 1, 3 ,1, 3, 5, 5, 3}));
    }
}
