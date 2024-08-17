public class pattern10 {

    public static void main(String[] args) {
        int n = 5;

        for(int i = n; i>0; i--){

            for(int j = 0; j<n-i; j++){
                System.out.print(" ");
            }

            for(int j=0; j<i; j++){
                System.out.print("* ");
            }

            if(i==1){
                continue;
            }else{
                System.out.println();
            }
        }

        for(int i = 0; i <=n; i++){
   
            if(i==1){
                continue;
            }else{
                for(int j=0; j<n-i; j++){
                    System.out.print(" ");
                }

                for(int j=0; j<i; j++){
                    System.out.print("* ");
                }
            }
            System.out.println();
            
        }
    }
    
}
