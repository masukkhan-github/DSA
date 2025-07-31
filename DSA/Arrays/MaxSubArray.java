package DSA.Arrays;
public class MaxSubArray {
    public static int max(int arr[]){
        int current = arr[0];
        int max = arr[0];

        for(int i=1; i<arr.length; i++){
            current = Math.max(arr[i], current + arr[i]);
            max = Math.max(max, current);
        }

        return max;
    }
    public static void main(String[] args) {
        int arr[]= {-2,-4,-5,-8,-10,-4,1,-5};
        System.out.println(max(arr));
    }
}
