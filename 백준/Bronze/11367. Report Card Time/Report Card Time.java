import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String removeEnter = sc.nextLine();

        for(int i = 0; i < n; i++){
            String name = sc.next();
            int age = sc.nextInt();

            if (age <= 59) {
                System.out.println(name + " " + "F");
            } else if (age <= 66) {
                System.out.println(name + " "+ "D");
            } else if (age <= 69) {
                System.out.println(name + " "+ "D+");
            } else if (age <= 76) {
                System.out.println(name + " "+ "C");
            } else if (age <= 79) {
                System.out.println(name + " "+ "C+");
            } else if (age <= 86) {
                System.out.println(name + " "+ "B");
            } else if (age <= 89) {
                System.out.println(name + " "+ "B+");
            } else if (age <= 96) {
                System.out.println(name + " "+ "A");
            } else if(age <= 100){
                System.out.println(name + " "+ "A+");
            }
        }
    }
}