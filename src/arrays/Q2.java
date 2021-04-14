package arrays;

/**
 * Array	Find the maximum and minimum element in an array
 */
class Pair{
    public int min;
    public int max;
}

public class Q2 {
    public static void main(String[] args) {
        int[] arr = {1000, 11, 445, 1, 330, 3000};
        int n = arr.length;
        Pair p =  new Pair();
        getMinMax(arr, n, p);
        System.out.println(p.min +" "+p.max);
    }

    private static void getMinMax(int[] arr, int n, Pair pair) {
        if(n==1){
            pair.min = arr[0];
            pair.max = arr[0];
        }

            if(arr[0]<arr[1]){
                pair.min = arr[0];
                pair.max = arr[1];
            }else{
                pair.max = arr[0];
                pair.min = arr[1];
            }

        for(int i=2 ;i<n;i++){
            if(pair.min>arr[i]){
                pair.min = arr[i];
            }else if(pair.max<arr[i]){
                pair.max = arr[i];
            }
        }
    }
}
