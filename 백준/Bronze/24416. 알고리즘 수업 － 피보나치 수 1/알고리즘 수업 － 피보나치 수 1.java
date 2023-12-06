import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int count1, count2 = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        fib(N);
        fibonacci(N);
        System.out.println(count1 + " " + count2);
    }

    public static int fib(int n) {
        if (n <= 2) {
            count1++;
            return 1;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }

    public static void fibonacci(int n) {
        int[] fibonacci = new int[n + 1];
        fibonacci[1] = 1;
        fibonacci[2] = 1;
        for (int i = 3; i <= n; i++) {
            count2++;
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }
    }
}
