//  *
//     *
//  *    *
//     *   *
//  *    *    *
//     *   *
//  *    *
//     *
//  *


public class pattern7 {
    
    public static void main(String[] args){
        int n = 4 ;

        for(int i = 0; i < n; i++){

            for(int j = 0; j < i; j++){
                System.out.print("*    ");
            }

            System.out.println();
            
            if(i == 3){
                continue;
            }else{
                for(int j = 0; j < i; j++){
                    System.out.print("   *");
                }
            }
            
            System.out.println();
        }

        for(int i = n-2; i > 0; i--){

            for(int j = 0; j < i; j++){
                System.out.print("   *");
            }

            System.out.println();

            for(int j = 0; j < i; j++){
                System.out.print("*    ");
            }
            System.out.println();
        }
        System.out.println();


    }
}

