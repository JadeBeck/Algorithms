import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        if(a == 0) System.out.println(1);
        else {
            long answer = 1;
            for(int i = 1; i <= a; i++) {
                answer = answer * i;
            }
            System.out.println(answer);
        }
    }
}