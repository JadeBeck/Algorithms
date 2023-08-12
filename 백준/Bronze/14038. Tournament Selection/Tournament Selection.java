import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int answer = 0;
        for(int i = 0; i < 6; i++) {
            String point = sc.nextLine();
            if(point.equals("W")) {
                answer++;
            }
        }

        if(answer >= 5) {
            System.out.println(1);
        } else if(answer >= 3) {
            System.out.println(2);
        } else if(answer >= 1) {
            System.out.println(3);
        } else {
            System.out.println(-1);
        }
    }
}