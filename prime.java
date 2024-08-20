public class prime {

    public static void main(String[] args) {
        for(int i = 2; i <= 5; ++i) {
            if (isprime(i)) {
                System.out.print("" + i + " ");
            }
        }

    }

static boolean isprime(int n) {
    if (n <= 1) {
        return false;
    } else {
        int c;
        for(c = 2; c * c <= n; c++) {
            if (n % c == 0) {
                return false;
            }
        }

        return c * c > n;
    }
    }
}