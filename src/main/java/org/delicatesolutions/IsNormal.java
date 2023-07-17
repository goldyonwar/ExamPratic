package org.delicatesolutions;
/*
A normal number is defined to be one that has no odd factors, except for 1 and possibly itself.
Write a method named isNormal that returns 1 if its integer argument is normal, otherwise it returns 0.
Examples: 1, 2, 3, 4, 5, 7, 8 are normal numbers. 6 and 9 are not normal numbers since 3 is an odd
factor. 10 is not a normal number since 5 is an odd factor. The function signature is
int isNormal(int n)
 */
public class IsNormal {
    public static int isNormal(int n) {
        int index = 2;
        while (index < n) {
            if (n % index == 0 && index % 2 != 0) {
                return 0;
            }
            index++;
        }
        return 1;
    }

    public static void main(String[] args){
        for (int i = 1; i < 11; i++) {
            System.out.println(isNormal(i));
        }

    }
}
