package org.delicatesolutions;

/*
The depth of an integer n is defined to be how many multiples of n is necessary to compute before all 10 digits have
appeared at least once in some multiple. For example, the depth of 42 is 9 as show by the following table.

Multiple        Value       New digit(s) contributed        Digit contribute by previous multiples
42*1            42          2,4                             none
42*2            84          8                               4 (by 42*1)
42*3            126         1,6                             2 (by 42*1)
42*4            168         none                            1,6 (by 42*3), 8 (by 42*2)
42*5            210         0                               1 (by 42*3), 2 (by 42*1)
42*6            252         5                               2 (by 42*1)
42*7            294         9                               2,4 (by 42*1)
42*8            336         3                               6 (by 42*3)
42*9            378         7                               3 (by 42*8), 8 (by 42*2)

if you look at the digit(s) contributed colum you will find all the digit from 0 to 9. Since it required 9
multiples of 42 to get all the digits, the depth of 42 is 9.

Write a function named computeDepth that compute the depth of its integer argument. Its signature is:
int computeDepth(int n)

Hint: Use an array to keep track of which digits have been contributed. Digit can be isolated using a
combination of modulo 10 and integer arithmetic.

Here are some other depth that you can use to verify your program.

if n is     it depth is     comment
7           10              7*10 = 70 which contribute the final 0, the only digit that has not yet appear in a previous multiple of 7
13          8               13*8 = 104 contributes the 0 and 4
25          36              36*25 = 900 contribute 9
 */
public class ComputeDepth {
    public static int computeDepth(int n) {
        boolean[] tracker = new boolean[10];
        int depth = 0, contributed;
        while (!allFound(tracker)) {
            depth++;
            contributed = n * depth;
            while (contributed > 0) {
                tracker[contributed % 10] = true;
                contributed /= 10;
            }
        }

        return depth;
    }

    public static boolean allFound(boolean[] a) {
        for (boolean contain : a) {
            if (!contain) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(computeDepth(42));
        System.out.println(computeDepth(7));
        System.out.println(computeDepth(13));
        System.out.println(computeDepth(25));
    }
}
