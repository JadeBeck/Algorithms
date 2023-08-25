import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a < 100) System.out.println(1);
        else {
            a = a * (100 - b) / 100;
            if (a >= 100) System.out.println(0);
            else System.out.println(1);

//            float A = a * (100 - b) / 100;
//            if (A >= 100) System.out.println(0);
//            else System.out.println(1);
        }
    }
}