package DSA.Arrays;

public class SelectonSort {
    public static void selection(int n[]){
        for(int i=0;i<n.length-1;i++){
            int min= i;
            for(int j=i+1;j<n.length;j++){
                if(n[min]>n[j]){
                    min =j;
                }
            }
            int temp = n[min];
            n[min] = n[i];
            n[i] = temp;
        }
    } 

    public static void print(int n[]){
        for(int i=0;i<n.length;i++){
            System.out.print(n[i]);
        }
    }
    public static void main(String[] args) {
        int n[]= {5,4,8,2,17,68,0,1};
        selection(n);
        print(n);
    }
}
