package org.delicatesolutions;

/*
Define the fullness quotient of an integer n > 0 to be the number of representations of n in bases 2 through 9
that have no zeroes anywhere after the most significant digit.
For example, to see why the fullness quotient of 94 is 6 examine the following table
which shows the representations of 94 in bases 2 through 9.
Notice that the representations of 94 in base 2 and 3 both have 0s
somewhere after the most significant digit, but the representations in bases 4, 5, 6, 7, 8, 9 do not.
Since there are 6 such representations, the fullness quotient of 94 is 6.
Write a method named fullnessQuotient that returns the fullness quotient of its argument.
If the argument is less than 1 return -1. Its signature is
int fullnessQuotient(int n)
Hint: use modulo and integer arithmetic to convert n to its various representations

if n is     return  Because
1           8       Because all of its representations do not have a 0 anywhere after the most significant digit:
                    2: 2, 3: 3, 4: 4, 5: 5, 6: 6, 7: 7, 8: 8, 9: 9
9           5       Because 5 of the representations (4, 5, 6, 7, 8) do not have a 0
                    anywhere after the most significant digit:
                    2: 1001, 3: 100, 4: 21, 5: 14, 6: 13, 7: 12, 8: 11, 9: 10
360         0       All its representations have a 0 somewhere after the most
                    significant digit:
                    2: 101101000, 3: 111100, 4: 11220, 5: 2420, 6: 1400,
                    7: 1023,8: 550, 9: 440
-4          -1      The argument must be > 0

base    representation of 94        because
2       1011110                     2^6 +2^4 +2^3 +2^2 +2^1 =94
3       10111                       3^4 +3^2 +3^1 +3^0 =94
4       1132                        4^3 +4^2 +3*4^1 +2*4^0 =94
5       334                         3*5^2+3*5^1+4*4^0=94
6       234                         2*6^2+3*6^1+4*6^0=94
7       163                         1*7^2+6*7^1+3*7^0=94
8       136                         1*8^2+3*8^1+6*8^0=94
9       114                         1*9^2+1*9^1+4*9^0=94



 */
public class FullnessQuotient {
    public static int fullnessQuotient(int n) {
        if (n<0){
            return -1;
        }
        int calculator,fullnessCounter=0;
        boolean isFullness;
        for (int i = 2; i <= 9; i++) {
            isFullness = true;
            calculator = n;
            while (calculator > 0) {
                if (calculator % i == 0) {
                    isFullness = false;
                    break;
                }

                calculator/=i;
            }
            if (isFullness){
                fullnessCounter++;
            }
        }

        return fullnessCounter;
    }

    public static void main(String[] args) {
        System.out.println(fullnessQuotient(1));
        System.out.println(fullnessQuotient(9));
        System.out.println(fullnessQuotient(94));
        System.out.println(fullnessQuotient(360));
        System.out.println(fullnessQuotient(-4));
    }
}
