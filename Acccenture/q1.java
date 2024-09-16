// Problem Description :
// The function accepts two positive integers ‘r’ and ‘unit’ and a positive integer array ‘arr’ of size ‘n’ as 
// its argument ‘r’ represents the number of rats present in an area, ‘unit’ is the amount of food each rat consumes 
// and each ith element of array ‘arr’ represents the amount of food present in ‘i+1’ house number, where 0 <= i

// Note:

// Return -1 if the array is null
// Return 0 if the total amount of food from all houses is not sufficient for all the rats.
// Computed values lie within the integer range.
// Example:

// Input:

// r: 7
// unit: 2
// n: 8
// arr: 2 8 3 5 7 4 1 2

// Output: 4

// Explanation:
// Total amount of food required for all rats = r * unit
// = 7 * 2 = 14.
// The amount of food in 1st houses = 2+8+3+5 = 18. Since, amount of food in 1st 4 houses is sufficient for all the rats. Thus, output is 4.

package Acccenture;

import java.util.*;

public interface q1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of rats");
        int r = sc.nextInt();
        System.out.println("Enter unit of food");
        int unit = sc.nextInt();
        System.out.println("enter no of foods");
        int n = sc.nextInt();
        int total = r * unit;
        int sum = 0;
        int arr[] = new int[n];
        System.out.println("Enter the qty");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int count = total(arr, n, total, sum, r, unit);
        System.out.println("Total Units: "+count);
         
        sc.close();
        
    }

     static int total(int arr[], int n, int total, int sum, int r, int unit){

        int count = 0;
        if (arr.length == 0){
            return -1;
        }

        for(int i=0; i<n; i++){

            if(sum <= total){
                sum += arr[i];
                count++;
            }
        }

        if(sum < total) return 0;
        return count;
    }
    
}
