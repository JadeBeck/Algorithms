import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int tea = sc.nextInt();
        String removeEnter = sc.nextLine();

        String line = sc.nextLine().trim().replaceAll(" ", "");

        int answer = 0;
        for(int i = 0; i < line.length(); i++) {
            if(Integer.parseInt(String.valueOf(line.charAt(i))) == tea) {
                answer++;
            }
        }
        System.out.println(answer);
    }
}