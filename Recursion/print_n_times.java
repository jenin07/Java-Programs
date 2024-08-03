
public class print_n_times {
    public static void main(String[] args) {
        int a = 10;
        print(a);
    }

    public static void print(int a) 
    {
        if(a==0) return;
        print(a-1);
        System.out.println(a);
    }
}
