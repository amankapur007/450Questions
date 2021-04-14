package arrays;

import java.util.Arrays;

/**
 * Array	Reverse the array
 */
public class Q1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(arr));
        reverse(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    private static void reverse(int[] arr, int length) {
        int start = 0;
        int end = length - 1;
        while (start<end){
            int c = arr[start];
            arr[start] = arr[end];
            arr[end] = c;
            start++;
            end--;
        }
    }

}
