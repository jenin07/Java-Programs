package Sorting;

public class InsertionSort {
    
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 9, 7};
        int n = arr.length;

        for(int i=0; i<=n-1; i++){
            int j = i;
            
            while(j>0 && arr[j-1] > arr[j]){
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;

                j--;
            }
        }

        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
