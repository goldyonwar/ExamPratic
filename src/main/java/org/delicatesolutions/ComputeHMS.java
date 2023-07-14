package org.delicatesolutions;
/*
Write a method named computeHMS that computes the number of hours, minutes and seconds in a given number of seconds. If you are programming in Java or C#, the method signature is
int[] computeHMS(int seconds);
If you are programming in C or C++, the method signature is int * computeHMS(int seconds);
The returned array has 3 elements; arr[0] is the hours, arr[1] is the minutes and arr[2] is the seconds contained within the seconds argument.
Recall that there are 3600 seconds in an hour and 60 seconds in a minute. You may assume that the numbers of seconds is non- negative.
Examples
If seconds is       then function returns       reason
3735                {1, 2, 15}                  because 3735 = 1*3600 + 2*60 +15. In other words, 3,735 is the number of seconds in 1 hour 2minutes and 15 seconds
380                 {0, 6, 20}                  because 380 = 0*3600 + 6*60 + 20
3650                {1, 0, 50}                  because 3650 = 1*3600 + 0*60 + 50
55                  {0, 0, 55}                  because 55 = 0*3600 + 0*60 + 55
0                   {0, 0, 0}                   because 0 = 0*3600 + 0*60 + 0
 */
public class ComputeHMS {
    public static int[] computeHMS(int seconds) {
        int[] result = new int[3];

        result[0] = seconds / 3600;
        result[1] = seconds % 3600 / 60;
        result[2] = seconds % 3600 % 60;
        return result;
    }

    public static void main(String[] args){
        System.out.println("h:"+computeHMS(3735)[0]+" m:"+computeHMS(3735)[1]+" s:"+computeHMS(3735)[2]);
        System.out.println("h:"+computeHMS(380)[0]+" m:"+computeHMS(380)[1]+" s:"+computeHMS(380)[2]);
        System.out.println("h:"+computeHMS(3650)[0]+" m:"+computeHMS(3650)[1]+" s:"+computeHMS(3650)[2]);
        System.out.println("h:"+computeHMS(55)[0]+" m:"+computeHMS(55)[1]+" s:"+computeHMS(55)[2]);
        System.out.println("h:"+computeHMS(0)[0]+" m:"+computeHMS(0)[1]+" s:"+computeHMS(0)[2]);
    }
}
