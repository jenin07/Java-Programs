package Sorting;

public class BubbleSort {
    public static void main(String[] args) {

        int[] arr = {64, 14, 25, 12, 22};
        int n = arr.length;

        for(int i=n-1; i>=0; i--){
            int swap = 0;
            for(int j=0; j<=i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                    swap = 1;
                }
            }
            if(swap == 0) break;
        }

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    
}
