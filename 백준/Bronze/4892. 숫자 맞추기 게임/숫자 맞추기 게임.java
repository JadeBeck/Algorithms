import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n0 = sc.nextInt();
        int i = 0;
        
        while(n0 != 0) {
            if(n0 % 2 == 0) {
                i++;
                System.out.println(i + ". even " + (n0 / 2));
            } else {
                i++;
                System.out.println(i + ". odd " + ((n0 - 1) / 2));
            }
             n0 = sc.nextInt();
        }
    }
}