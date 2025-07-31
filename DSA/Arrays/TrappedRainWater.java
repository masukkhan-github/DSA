package DSA.Arrays;
public class TrappedRainWater {
    public static int water(int arr[]){
       
        int n = arr.length;
        //leftMax
        int leftMax[] = new int[n];
        leftMax[0] = arr[0];
        for(int i=1; i<n; i++){
            leftMax[i] = Math.max(arr[i], leftMax[i-1]);
        }

        //rightMax
        int rightMax[] = new int[n];
        rightMax[n-1] = arr[n-1];
        for(int i=n-2; i>=0; i--){
            rightMax[i] = Math.max(arr[i],rightMax[i+1]);
        }

        int trappedWater = 0;
        for(int i=0; i<arr.length; i++){
            int waterLevel = Math.min(leftMax[i],rightMax[i]);
            trappedWater += waterLevel-arr[i];
        }

            return trappedWater;
    }
    public static void main(String[] args) {
        int num[] ={4,2,0,6,3,2,5};
        System.out.println(water(num));
    }
}
