import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long A = sc.nextLong();

        int n = 0;

        if (A == 0) System.out.println(0);
        else {
            while (A != 1) {
                if (A % 2 == 0) {
                    A = A / 2;
                } else {
                    A = A + 1;
                }
                n++;
            }
            System.out.println(n);
        }
    }
}