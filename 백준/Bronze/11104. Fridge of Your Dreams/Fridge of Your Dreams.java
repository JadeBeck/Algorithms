import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
     
        for(int i = 0; i < n; i++){
            String a = sc.next();
            int num2 = Integer.parseInt(a, 2);
            System.out.println(num2);
        }
    }
}