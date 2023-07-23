package org.delicatesolutions;

/*
Write a function named countRepresentations that returns the number of ways that an amount of money in rupees can be
represented as rupee notes. For this problem we only use rupee notes in denominations of 1, 2, 5, 10 and 20 rupee notes.
The signature of the function is:
int countRepresentations(int numRupees)
For example, countRepresentations(12) should return 15 because 12 rupees can be represented in the following 15 ways.
1. 12 one rupee notes
2. 1 two rupee note plus 10 one rupee notes
3. 2 two rupee notes plus 8 one rupee notes
4. 3 two rupee notes plus 6 one rupee notes
5. 4 two rupee notes plus 4 one rupee notes
6. 5 two rupee notes plus 2 one rupee notes
7. 6 two rupee notes
8. 1 five rupee note plus 7 one rupee notes
9. 1 five rupee note, 1 two rupee note and 5 one rupee notes
10. 1 five rupee note, 2 two rupee notes and 3 one rupee notes
11. 1 five rupee note, 3 two notes and 1 one rupee note
12. 2 five rupee notes and 2 one rupee notes
13. 2 five rupee notes and 1 two rupee note
14. 1 ten rupee note and 2 one rupee notes
15. 1 ten rupee note and 1 two rupee note
Hint: Use a nested loop that looks like this. Please fill in the blanks intelligently, i.e. minimize the number of times that the if statement is executed.
for (int rupee20=0; rupee20<=__; rupee20++)
for (int rupee10=0; rupee10<=__; rupee10++) for (int rupee5=0; rupee5<=__; rupee5++)
for (int rupee2=0; rupee2<=__; rupee2++) for (int rupee1=0; rupee1<=__; rupee1++) {
if (___) count++
}
 */
public class CountRepresentations {

    public static int countRepresentations(int numRupees) {
        int count = 0;
        for (int rupee20 = 0; rupee20 <= numRupees / 20; rupee20++)
            for (int rupee10 = 0; rupee10 <= numRupees / 10; rupee10++)
                for (int rupee5 = 0; rupee5 <= numRupees / 5; rupee5++)
                    for (int rupee2 = 0; rupee2 <= numRupees / 2; rupee2++)
                        for (int rupee1 = 0; rupee1 <= numRupees; rupee1++) {
                            if (rupee20 * 20 + rupee10 * 10 + rupee5 * 5 + rupee2 * 2 + rupee1 == numRupees) count++;
                        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(countRepresentations(1));
        System.out.println(countRepresentations(2));
        System.out.println(countRepresentations(3));
        System.out.println(countRepresentations(5));
        System.out.println(countRepresentations(12));
    }
}
