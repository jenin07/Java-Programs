
public class XOR {
    public static void main(String[] args) {
        int n = 5;
        int arr[] = {2, 5, 6, 23, 89};
        int sum = 0;

        for (int i=0; i<n; i++){
            sum ^= arr[i];
        }

        System.out.println(sum);
    }
}