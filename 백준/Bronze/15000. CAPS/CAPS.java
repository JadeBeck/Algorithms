import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String contents = sc.nextLine();
        String upperResults = contents.toUpperCase();
        
        System.out.println(upperResults);
    }
}