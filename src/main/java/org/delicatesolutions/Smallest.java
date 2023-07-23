package org.delicatesolutions;

/*
The number 124 has the property that it is the smallest number whose first three multiples contain the digit 2. Observe that
124*1 = 124, 124*2 = 248, 124*3 = 372 and that 124, 248 and 372 each contain the digit 2. It is possible to generalize this
 property to be the smallest number whose first n multiples each contain the digit 2. Write a function named smallest(n)
 that returns the smallest number whose fir n multiples contain the digit 2. Hint: use modulo base 10 arithmetic to examine digits.
Its signature is int smallest(int n)
You may assume that such a number is computable on a 32 bit machine, i.e, you do not have to detect integer overflow in your answer.
 Examples
If n is
return because
4 624
5 624
6 642
7 4062
because the first four multiples of 624 are 624, 1248, 1872, 2496 and they all contain the
digit 2. Furthermore 624 is the smallest number whose first four multiples contain the digit 2. because the first five multiples of 624 are 624, 1248, 1872, 2496, 3120. Note that 624 is also the smallest number whose first 4 multiples contain the digit 2.
because the first five multiples of 642 are 642, 1284, 1926, 2568, 3210, 3852
because the first five multiples of 4062 are 4062, 8124, 12186, 16248, 20310, 24372, 28434. Note that it is okay for one of the multiples to contain the digit 2 more than once (e.g., 24372).
 */
public class Smallest {
    public static int smallest(int n) {
        int smallest = 1, factor;
        boolean isContain = false;
        while (smallest < Integer.MAX_VALUE) {
            for (int i = 1; i <= n; i++) {
                factor = smallest * i;
                isContain = false;
                while (factor > 0) {
                    if (factor % 10 == 2) {
                        isContain = true;
                        break;
                    }
                    factor /= 10;
                }
                if (!isContain) {
                    break;
                }
            }
            if (isContain) {
                break;
            }
            smallest++;
        }

        return smallest;
    }

    public static void main(String[] args) {
        System.out.println(smallest(4));
        System.out.println(smallest(5));
        System.out.println(smallest(6));
        System.out.println(smallest(7));
    }
}
