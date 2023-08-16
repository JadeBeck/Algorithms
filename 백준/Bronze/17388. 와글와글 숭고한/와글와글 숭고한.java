import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int s = sc.nextInt();
        int k = sc.nextInt();
        int h = sc.nextInt();

        int[] arr = {s, k, h};
        int min = arr[0];

        if (s + k + h >= 100) {
            System.out.println("OK");
        } else {
            for (int num : arr) {
                if (num < min) {
                    min = num;
                }
            }
            if (min == s) {
                System.out.println("Soongsil");
            } else if (min == k) {
                System.out.println("Korea");
            } else {
                System.out.println("Hanyang");
            }
        }
    }
}