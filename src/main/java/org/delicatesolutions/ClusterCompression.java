package org.delicatesolutions;

import java.util.Arrays;

/*
Define a cluster in an integer array to be a maximum sequence of elements that are all the same value.
For example, in the array {3, 3, 3, 4, 4 3, 2, 2, 2, 2, 4} there are 5 clusters, {3, 3, 3}, {4, 4}, {3}, {2, 2, 2, 2} and {4}.
A cluster-compression of an array replaces each cluster with the number that is repeated in the cluster.
So, the cluster compression of the previous array would be {3, 4, 3, 2, 4}.
The first cluster {3, 3, 3} is replaced by a single 3, and so on.
Write a function named clusterCompression with the following signature If you are programming in Java or
C#, the function signature is
int[ ] clusterCompression(int[ ] a)
If you are programming in C++ or C, the function signature is
int *clusterCompression(int a[ ], int len) where len is the length of the array.
s
,
The function returns the cluster compression of the array a. The length of the returned array must be equal to the number
 of clusters in the origin array! This means that someplace in your answer you must dynamically allocate the returned array.
In Java or C# you can use
int[ ] result = new int[numClusters];
 */
public class ClusterCompression {

    public static int[] clusterCompression(int[] a) {
        if (a.length<2){
            return a;
        }
        int[] maxCluster = new int[a.length];
        int currentClusterValue = a[0];
        int numClusters = 0;
        for (int j : a) {
            if (j != currentClusterValue) {
                maxCluster[numClusters++] = currentClusterValue;
                currentClusterValue = j;
            }
        }
        maxCluster[numClusters++] = currentClusterValue;
        int[] result = new int[numClusters];
        System.arraycopy(maxCluster, 0, result, 0, numClusters);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(clusterCompression(new int[]{3, 3, 3, 4, 4, 3, 2, 2, 2, 2, 4})));
        System.out.println(Arrays.toString(clusterCompression(new int[]{0, 0, 0, 2, 0, 2, 0, 2, 0, 0})));
        System.out.println(Arrays.toString(clusterCompression(new int[]{18})));
        System.out.println(Arrays.toString(clusterCompression(new int[]{})));
        System.out.println(Arrays.toString(clusterCompression(new int[]{-5, -5, -5, -5, -5})));
        System.out.println(Arrays.toString(clusterCompression(new int[]{1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1})));
        System.out.println(Arrays.toString(clusterCompression(new int[]{8, 8, 6, 6, -2, -2, -2})));
    }
}
