package org.delicatesolutions;

/**
 * Consider a simple pattern matching language that matches arrays of integers. A pattern is an array of integers.
 * An array matches a pattern if it contains sequences of the pattern elements in the same order as they appear in the
 * pattern. So for example, the array {1, 1, 1, 2, 2, 1, 1, 3} matches the pattern {1, 2, 1, 3} as follows:
 * {1, 1, 1, 2, 2, 1, 1, 3} {1, 2, 1, 3} (first 1 of pattern matches three 1s in array)
 * {1, 1, 1, 2, 2, 1, 1, 3} {1, 2, 1, 3} (next element of pattern matches two 2s in array) {1, 1, 1, 2, 2, 1, 1, 3}
 * {1, 2, 1, 3} (next element of pattern matches two 1s in array) {1, 1, 1, 2, 2, 1, 1, 3} {1, 2, 1, 3}
 * (last element of pattern matches one 3 in array)
 * The pattern must be completely matched, i.e. the last element of the array must be matched by the last element of
 * the pattern. Here is an incomplete function that does this pattern matching. It returns 1 if the pattern matches
 * the array, otherwise it returns 0.
 * static int matchPattern(int[] a, int len, int[] pattern, int patternLen) {
 * // len is the number of elements in the array a, patternLen is the number of elements in the pattern.
 * int i=0; // index into a
 * int k=0; // index into pattern
 * int matches = 0; // how many times current pattern character has been matched so far for (i=0; i<len; i++) {
 * if (a[i] == pattern[k])
 * matches++; // current pattern character was matched
 * else if (matches == 0 || k == patternLen-1)
 * return 0; // if pattern[k] was never matched (matches==0) or at end of pattern (k==patternLen-1)
 * else // advance to next pattern character {
 * !!You write this code!!
 * } // end of else } // end of for
 * // return 1 if at end of array a (i==len) and also at end of pattern (k==patternLen-1)
 * if (i==len && k==patternLen-1) return 1; else return 0; }
 * Please finish this function by writing the code for the last else statement. Your answer just has to include this code, you do not have to write the entire function.
 * Hint: You need at least 4 statements (one of them an if statement)
 * Examples
 * <p>
 * if a is                              and pattern is  return  reason
 * {1, 1, 1, 1, 1}                          {1}           1     because all elements of the array match the pattern element 1
 * {1}                                      {1}           1     because all elements of the array match the pattern element 1
 * {1, 1, 2, 2, 2, 2}                       {1, 2}        1     because the first two 1s of the array are matched by the first pattern element, last four 2s of array are matched by the last pattern element
 * {1, 2, 3}                                {1, 2}        0     because the 3 in the array is not in the pattern.
 * {1, 2}                                   {1, 2, 3}     0     because the 3 in the pattern is not in the array
 * {1, 1, 2, 2, 2, 2, 3}                    {1, 3}        0     because at least one 3 must appear after the sequence of 1s.
 * {1, 1, 1, 1}                             {1, 2}        0     because the array ends without matching the pattern element 2.
 * {1, 1, 1, 1, 2, 2, 3, 3}                 {1, 2}        0     because the element 3 of the array is not matched
 * {1, 1, 10, 4, 4, 3}                      {1, 4, 3}     0     because the 10 element is not matched by the 4 pattern element. Be sure your code handles this situation correctly!
 */
public class MatchPattern {

    public static int matchPattern(int[] a, int len, int[] pattern, int patternLen) {
        // len is the number of elements in the array a, patternLen is the number of elements in the pattern.
        int i = 0; // index into a
        int k = 0; // index into pattern
        int matches = 0; // how many times current pattern character has been matched so far
        for (i = 0; i < len; i++) {
            if (a[i] == pattern[k])
                matches++; // current pattern character was matched
            else if (matches == 0 || k == patternLen - 1)
                return 0; // if pattern[k] was never matched (matches==0) or at end of pattern (k==patternLen-1)
            else {// advance to next pattern character
                //!!You write this code!!
                k++;
                // Check if the current pattern character is in the array
                if (a[i] == pattern[k]) {
                    // If it is, increment the number of matches
                    matches++;
                } else {
                    // If it is not, return 0
                    return 0;
                }
            } // end of else
        } // end of for
        // return 1 if at end of array a (i==len) and also at end of pattern (k==patternLen-1)
        if (i == len && k == patternLen - 1) return 1;
        else return 0;
    }

    public static void main(String[] args) {
        int[] array1 = {1, 1, 1, 1, 1};
        int[] array2 = {1};
        int[] array3 = {1, 1, 2, 2, 2, 2};
        int[] array4 = {1, 2, 3};
        int[] array5 = {1, 2};
        int[] array6 = {1, 1, 2, 2, 2, 2, 3};
        int[] array7 = {1, 1, 1, 1};
        int[] array8 = {1, 1, 1, 1, 2, 2, 3, 3};
        int[] array9 = {1, 1, 10, 4, 4, 3};

        int[] pattern1 = {1};
        int[] pattern2 = {1, 2};
        int[] pattern3 = {1, 2, 3};
        int[] pattern4 = {1, 3};
        int[] pattern5 = {1, 4, 3};

        System.out.println(matchPattern(array1,array1.length,pattern1,pattern1.length));   // Output: 1
        System.out.println(matchPattern(array2,array2.length,pattern1,pattern1.length));   // Output: 1
        System.out.println(matchPattern(array3,array3.length,pattern2,pattern2.length));   // Output: 1
        System.out.println(matchPattern(array4,array4.length,pattern2,pattern2.length));   // Output: 0
        System.out.println(matchPattern(array5,array5.length,pattern3,pattern3.length));   // Output: 0
        System.out.println(matchPattern(array6,array6.length,pattern4,pattern4.length));   // Output: 0
        System.out.println(matchPattern(array7,array7.length,pattern2,pattern2.length));   // Output: 0
        System.out.println(matchPattern(array8,array8.length,pattern2,pattern2.length));   // Output: 0
        System.out.println(matchPattern(array9,array9.length,pattern5,pattern5.length));   // Output: 0

    }

}
