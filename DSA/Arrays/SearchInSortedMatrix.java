package DSA.Arrays;

public class SearchInSortedMatrix {
    public static boolean search(int arr[][],int key){
        int Row = arr.length-1;
        int Col = 0;

        while(Row >= 0 && Col<=arr[0].length-1){
            if(key == arr[Row][Col]){
                System.out.println("(" + Row+","+ Col + ")");
                return true;
            }else if(key > arr[Row][Col] ){
                Col++;
            }else{
                Row --;
            }
        }

        System.out.println("Key not found");
        return false;
    }
    public static void main(String[] args) {
        int mat[][] = {
                        {10,20,30,40},
                        {15,25,35,45},
                        {27,29,37,48},
                        {32,33,39,50}
                      };
        search(mat, 25);
    }
}
