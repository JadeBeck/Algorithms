import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        int sum = a*1 + b*3 + c*1;
        
        //if((91 + sum) % 10 == 0)
            System.out.println("The 1-3-sum is " + (91 + sum));
    }
}