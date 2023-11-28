//  Given two sorted arrays, the task is to merge them in a sorted manner.
//        Examples:
//        Input: arr1[] = { 1, 3, 4, 5}, arr2[] = {2, 4, 6, 8}
//        Output: arr3[] = {1, 2, 3, 4, 4, 5, 6, 8}
//
//        Input: arr1[] = { 5, 8, 9}, arr2[] = {4, 7, 8}
//        Output: arr3[] = {4, 5, 7, 8, 8, 9}


public class Task2 {
    public static int[] mergeSortedArrays(int[] array1, int[] array2) {
        int m = array1.length;
        int n = array2.length;

        int[] mergedArray = new int[m + n];

        int i = 0, j = 0, k = 0;

        while (i < m && j < n) {
            if (array1[i] <= array2[j]) {
                mergedArray[k] = array1[i];
                i++;
            } else {
                mergedArray[k] = array2[j];
                j++;
            }
            k++;
        }

        while (i < m) {
            mergedArray[k] = array1[i];
            i++;
            k++;
        }

        while (j < n) {
            mergedArray[k] = array2[j];
            j++;
            k++;
        }

        return mergedArray;
    }
}
