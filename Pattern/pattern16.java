// A 
// B C
// D E F
// G H I J

public class pattern16 {
    
    public static void main(String[] args) {
        int n = 5;
        char k = 'A';

        for (int i=1; i<n; i++){
            
            for (int j=0; j<i; j++){
                System.out.print(k+" ");
                k++;
            }
        System.out.println();
        }
    }
}
