package org.delicatesolutions;

/*
An integer is defined to be “continuous factored” if it can be expressed as the product of two or more continuous integers greater than 1.
Examples of “continuous factored” integers are:
6 = 2 * 3.
60 = 3 * 4 * 5
120 = 4 * 5 * 6
90 = 9*10
Examples of integers that are NOT “continuous factored” are: 99 = 9*11, 121=11*11, 2=2, 13=13
Write a function named isContinuousFactored(int n) that returns 1 if n is continuous factored and 0 otherwise.
 */
public class IsContinuousFactored {
    public static int isContinuousFactored(int n) {
        int index = 2, innerIndex, holder, previousFactor;
        while (index <= n / 2) {

            holder = n;
            previousFactor = 1;
            innerIndex = index;
            while (holder > 0) {
                if (holder % innerIndex == 0) {
                    if (previousFactor != 1) {
                        if (previousFactor + 1 != innerIndex) {
                            return 0;
                        } else {
                            if (holder % innerIndex == 0) {
                                return 1;
                            }
                        }

                    }
                    previousFactor = innerIndex;
                    holder /= innerIndex;
                    innerIndex++;
                }else {
                    break;
                }

            }
            index++;
        }

        return 0;
    }


    public static void main(String[] args) {
        System.out.println(isContinuousFactored(6));
        System.out.println(isContinuousFactored(60));
        System.out.println(isContinuousFactored(120));
        System.out.println(isContinuousFactored(90));
        System.out.println(isContinuousFactored(99));
        System.out.println(isContinuousFactored(121));
        System.out.println(isContinuousFactored(2));
        System.out.println(isContinuousFactored(13));
    }
}
