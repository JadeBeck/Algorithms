import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        PriorityQueue<Integer> plusPQ = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> minusPQ = new PriorityQueue<>();
        int zeros = 0;
        int ones = 0;

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();

            if (num == 0) zeros++;
            else if (num == 1) ones++;
            else if (num > 1) plusPQ.add(num);
            else minusPQ.add(num);
        }

        int sum = 0;

        while (plusPQ.size() > 1) {
            int a = plusPQ.poll();
            int b = plusPQ.poll();
            sum += a * b;
        }
        if (!plusPQ.isEmpty()) sum += plusPQ.poll();

        while (minusPQ.size() > 1) {
            int a = minusPQ.poll();
            int b = minusPQ.poll();
            sum += a * b;
        }

        if (!minusPQ.isEmpty() && zeros == 0) sum += minusPQ.poll();

        sum += ones;

        System.out.println(sum);
    }
}