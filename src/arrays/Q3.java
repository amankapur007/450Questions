package arrays;

import java.util.Arrays;

/**
 * Array	Find the "Kth" max and min element of an array
 */
public class Q3 {
    public static void main(String[] args) {
        int []arr = {7, 10, 4, 20, 15};
        int n = arr.length;
        //merge sort
        sort(arr,0,n-1);
        int k = 4;
        System.out.println(arr[k-1]);
    }

    private static void sort(int[] arr, int low, int end) {
        if(low<end){
            int mid = (low+end)/2;
            sort(arr,low, mid);
            sort(arr,mid+1, end);
            merge(arr, low, mid, end);
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void merge(int[] arr, int low, int mid, int end) {
        int []temp = new int[end-low+1];
        int i = low;
        int j = mid+1;
        int k = 0;
        while(i<=mid && j<=end){
            if(arr[i]<arr[j]){
                temp[k] = arr[i];
                k++;
                i++;
            }else{
                temp[k] = arr[j];
                k++;
                j++;
            }

        }

        while(i<=mid){
            temp[k] = arr[i];
            k++;
            i++;
        }

        while (j<=end){
            temp[k] = arr[j];
            k++;
            j++;
        }

        for(i = low; i <= end; i += 1) {
            arr[i] = temp[i - low];
        }
    }
}
