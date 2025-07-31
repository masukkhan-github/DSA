package DSA.Arrays;


public class BubbleSort {
    public static void bubble(int[] arr){
        //arr = 5
        for(int i=0;i<arr.length-1;i++){//0-3 = 0,1,2,3(<4)
            int swap = 0;
            for(int j=0; j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap = 1;
                }
            }
            if(swap == 0) break;
        }
    }

    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,0,0};
        bubble(arr);
        print(arr);
    }
}
