package org.delicatesolutions;

/*
Define an array to be trivalent if all its elements are one of three different values. For example, {22, 19, 10, 10, 19, 22, 22, 10}
 is trivalent because all elements are either 10, 22, or 19. However, the array {1, 2, 2, 2, 2, 2, 2}
 is not trivalent because it contains only two different values (1, 2). The array {2, 2, 3, 3, 3, 3, 2, 41, 65} is not trivalent
 because it contains four different values (2, 3, 41, 65).
Write a function named isTrivalent that returns 1 if its array argument is trivalent, otherwise it returns 0.
If you are writing in Java or C#, the function signature is
int isTrivalent (int[ ] a)
If you are writing in C or C++, the function signature is
int isTrivalent(int a[ ], int len) where len is the number of elements in the array a.
Hint: Remember that the elements of the array can be any value, so be careful how you initialize your local variables! For example using -1 to initialize a variable won’t work because -1 might be one of the values in the array.
 */
public class IsTrivalent {
    public static int isTrivalent(int[] a) {

        int count = 0;
        boolean[] isVisited = new boolean[a.length];

        for (int i = 0; i < a.length; i++) {
            if (isVisited[i]) {
                continue;
            }
            count++;
            for (int j = i + 1; j < a.length; j++) {
                if (!isVisited[j] && a[i] == a[j]) {
                    isVisited[j] = true;

                }
            }
            isVisited[i] = true;
            if (count > 3) {
                return 0;
            }
        }

        return count == 3 ? 1 : 0;
    }

    public static void main(String[] args){
        System.out.println(isTrivalent(new int[]{22, 19, 10, 10, 19, 22, 22, 10}));
        System.out.println(isTrivalent(new int[]{1, 2, 2, 2, 2, 2, 2}));
        System.out.println(isTrivalent(new int[]{2, 2, 3, 3, 3, 3, 2, 41, 65}));
    }
}
