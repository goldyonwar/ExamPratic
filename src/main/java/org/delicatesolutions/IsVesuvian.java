package org.delicatesolutions;

/**
 * A number n is vesuvian if it is the sum of two different pairs of squares. For example, 50 is vesuvian because
 * 50 == 25 + 25 and 1 + 49. The numbers 65 (1+64, 16+49) and 85 (4+81, 36+49) are also vesuvian. 789 of the first
 * 10,000 integers are vesuvian.
 * Write a function named isVesuvian that returns 1 if its parameter is a vesuvian number, otherwise it returns 0.
 * Hint: be sure to verify that your function detects that 50 is a vesuvian number!
 */
public class IsVesuvian {
    public static int isVesuvian(int a) {
        int count = 0;
        for (int i = 0; i < a; i++) {
            for (int j = a - 1; j > 1; j--) {
                if (getSquare(i)+getSquare(j) == a){
                    count++;
                }
                if (count==2){
                    return 1;
                }
            }
        }
        return 0;
    }

    private static int getSquare(int a) {
        return a * a;
    }

    public static void main(String[] args) {
        System.out.println(isVesuvian(50));
        System.out.println(isVesuvian(65));
        System.out.println(isVesuvian(85));
        System.out.println(isVesuvian(1));
    }
}
