import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();
        
        while(a != 0 && b != 0) {
            if (a > b) {
                System.out.println("Yes");
                a = sc.nextInt();
                b = sc.nextInt();
            } else {
                System.out.println("No");
                a = sc.nextInt();
                b = sc.nextInt();
            }
        }
    }
}