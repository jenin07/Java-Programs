import java.util.*;

class Customer{
    String customerName;
    double transactionAmount;

    public Customer(String customerName, double transactionAmount){
        this.customerName = customerName;
        this.transactionAmount = transactionAmount;
    }

}


public class CA1 {
    public static void main(String[] args) {

        Customer [] transactions = {
            new Customer("Alex", 500),
            new Customer("Bob", 400),
            new Customer("Martha", 321),
            new Customer("Mary", 756),
            new Customer("Sam", 452),
            new Customer("Sanjay", 860),
            new Customer("Daniel", 1254)
        }; 
        
        mergeSort(transactions, 0, transactions.length -1);

        System.out.println("Sorted Transactions: ");

        for( Customer transaction : transactions){
            System.out.println(transaction.customerName+" "+transaction.transactionAmount);
        }

    }
    

        public static void mergeSort(Customer [] arr, int low, int high ){

            if(low < high){
                int mid = (low + high) / 2;
                mergeSort( arr, low , mid);
                mergeSort(arr, mid + 1, high);
                merge(arr, low, mid, high);

            }

        }

        public static void merge ( Customer [] arr, int low, int mid, int high){
             
                Customer [] left = Arrays.copyOfRange(arr, low, mid + 1);
                Customer [] right = Arrays.copyOfRange(arr, mid + 1, high +1);

                int i = 0, j = 0, k= low;

                while (i < left.length && j < right.length){
                    
                    if(left[i].transactionAmount < right[j].transactionAmount){
                        arr[k++] = left[i++];
                    }
                    else{
                        arr[k++] = right[j++];
                    }
                }

                while (i < left.length){
                    arr[k++] = left[i++];
                }

                while (j < right.length) {
                    arr[k++] = right[j++];
                }


            }

    }

    


