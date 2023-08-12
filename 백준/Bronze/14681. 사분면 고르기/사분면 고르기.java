import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String x = sc.nextLine();
        String y = sc.nextLine();

        if(x.charAt(0) != '-' && y.charAt(0) != '-') System.out.println(1);
        else if(x.charAt(0) == '-' && y.charAt(0) != '-') System.out.println(2);
        else if(x.charAt(0) == '-' && y.charAt(0) == '-') System.out.println(3);
        else if(x.charAt(0) != '-' && y.charAt(0) == '-') System.out.println(4);
    }
}