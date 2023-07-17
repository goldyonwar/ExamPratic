package org.delicatesolutions;

import java.util.ArrayList;

/*
A positive number n is consecutive-factored if and only if it has factors, i and j where i > 1, j > 1 and j = i + 1.
Write a function named isConsecutiveFactored that returns 1 if its argument is consecutive-factored, otherwise it returns 0.
the function signature is
int isConsectiveFactored(int n)
Examples:
If n is     return      because
24          1           24 = 2*3*4 and 3 = 2 + 1
105         0           105 = 3*5*7 and 5 != 3+1 and 7 != 5+1
90          1           factors of 90 include 2 and 3 and 3 = 2 + 1
23          0           has only 1 factor that is not equal to 1
15          0           15 = 3*5 and 5 != 3 + 1
2           0           2 = 1*2, 2 = 1 + 1 but factor 1 is not greater than 1
0           0           n has to be positive
-12         0           n has to be positive

 */
public class IsConsecutiveFactored {
    public static int isConsecutiveFactored(int n) {
        if (n < 2) {
            return 0;
        }
        ArrayList<Integer> factors = new ArrayList<>();
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                factors.add(i);
            }
        }

        for (int i = 0; i < factors.size(); i++) {
            for (int j = factors.size() - 1; j >= 0; j--) {
                if (!factors.get(i).equals(factors.get(j))) {
                    if (factors.get(j) == factors.get(i) + 1) {
                        return 1;
                    }
                }
            }
        }

        return 0;
    }

    public static void main(String[] args){
        System.out.println(isConsecutiveFactored(24));
        System.out.println(isConsecutiveFactored(105));
        System.out.println(isConsecutiveFactored(90));
        System.out.println(isConsecutiveFactored(23));
        System.out.println(isConsecutiveFactored(15));
        System.out.println(isConsecutiveFactored(2));
        System.out.println(isConsecutiveFactored(0));
        System.out.println(isConsecutiveFactored(-12));
    }
}
