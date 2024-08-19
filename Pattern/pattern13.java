     
//      1
//     23
//    456
//   78910

public class pattern13 {
    
    public static void main (String[] args){
        int n = 5;
        int k = 1;

        for (int i=1; i<n; i++){

            for(int j=0; j<n-i; j++){
                System.out.print(" ");
            }
            for (int j=0; j<i; j++){
                System.out.print(k); //1
                k++; //2
            }

            k=i+1; //1
            System.out.println();
        }
    }
}

