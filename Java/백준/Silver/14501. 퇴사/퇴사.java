import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] D = new int[N + 2];
        int[] Time = new int[N + 1];
        int[] Price = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            Time[i] = sc.nextInt();
            Price[i] = sc.nextInt();
        }

        for (int i = N; i >= 1; i--) {
            if (i + Time[i] > N + 1) D[i] = D[i + 1];
            else D[i] = Math.max(D[i + 1], Price[i] + D[i + Time[i]]);
        }
        System.out.println(D[1]);
    }
}
