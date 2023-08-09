import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a != b) {
            System.out.println(Math.abs(b - a) - 1);
        } else {
            System.out.println(0);
        }

        List<Integer> Array = new ArrayList<Integer>();
        if(a<b) {
            for (int i = a + 1; i < b; i++) {
                Array.add(i);
            }
        } else if(a>b) {
            for(int i = b + 1; i < a; i++) {
                Array.add(i);
            }
        } /*else {
            Array.add(0);
        }*/
        //System.out.println(Array);
         for (Integer i : Array) { // for문을 통한 전체출력
            if(i != b - 1) {
                System.out.print(i + " ");
            } else {
                System.out.print(i);
            }
        }
    }
}