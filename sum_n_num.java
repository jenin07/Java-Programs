public class sum_n_num {
    public static void main(String[] args) {
        int a = 6;
        // int n = 1;
        sum_n(a);
    }

    // public static void sum_n(int a, int n)
    // {
    //     if (a==0){
    //         System.out.println(n);
    //         return;
    //     }
    //     n+=a;
    //     sum_n(a-1, n);
    // }

    public static int sum_n(int a){
        if(a==0)return 0;

        return a+sum_n(a-1);
    }
}