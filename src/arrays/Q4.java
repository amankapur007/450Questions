package arrays;

import java.util.Arrays;

/**
 * Array	Given an array which consists of only 0, 1 and 2. Sort the array without using any sorting algo
 */
public class Q4 {

    public static void main(String[] args) {
        int []arr = {0, 2 ,1, 2, 0};
        int c0=0;
        int c1=0;
        int c2=0;
        for (int j : arr) {
            if (j == 0) c0++;
            else if (j == 1) c1++;
            else c2++;
        }
        for(int i=0;i<c0;i++){
            arr[i]=0;
        }
        for(int i=c0;i<c0+c1;i++){
            arr[i]=1;
        }
        for(int i=c1+c0;i<c1+c2+c0;i++){
            arr[i]=2;
        }
        System.out.println(Arrays.toString(arr));
    }
}
