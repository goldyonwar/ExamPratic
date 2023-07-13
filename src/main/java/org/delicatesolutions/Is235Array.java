package org.delicatesolutions;


// didn't finish
public class Is235Array {
    public static int is235Array(int[] a) {
        int counter2 = 0, counter3 = 0, counter5 = 0,counterNon=0;
        for (int j : a) {
            if (j % 2 == 0) {
                counter2++;
            }

            if (j % 3 == 0) {
                counter3++;
            }

            if (j % 5 == 0) {
                counter5++;
            }

            if (j % 2 == 0 && j % 3 == 0 && j % 5 == 0){
                counterNon++;
            }
        }

        if (counter2 + counter3 + counter5 == a.length) {
            return 1;
        }

        return 0;
    }

    public static void main(String[] args){
        System.out.println(is235Array(new int[]{2, 3, 5, 7, 11}));
        System.out.println(is235Array(new int[]{2, 3, 5, 7, 11}));
    }
}
