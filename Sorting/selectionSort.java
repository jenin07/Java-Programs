package Sorting;

public class selectionSort {
    
    public static void main(String[] args) {
    
        int[] arr = {5, 2, 8, 1, 9};

        for (int i=0; i<arr.length;i++){
            int min = i;

            for(int j=i; j<arr.length-1; j++){
                if(arr[j] < arr[min]) min = j;
            }

            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;

        }

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    
    }
}
