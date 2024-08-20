//    1
//   232
//  34534
// 4567456

public class pattern14 {

    public static void main (String[] args){
        int n = 5;
        int k = 1;

        for (int i=1; i<n; i++){

            for(int j=1; j<n-i; j++){
                System.out.print(" ");
            }
            for (int j=0; j<i; j++){
                System.out.print(k); 
                k++; 
            }
            
            k=i;

            for(int j=k; j>1; j--){
                System.out.print(k);
                k++;
            }
            
            k=i+1;
            System.out.println();
        }
    }
    
}
