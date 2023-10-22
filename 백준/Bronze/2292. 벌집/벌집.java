import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int input = Integer.parseInt(st.nextToken());
        int i = 0;

        while (true) {
            if (input <= 3 * i * i - 3 * i + 1) { // 최댓값보다 작?
                if (input >= 3 * i * i - 9 * i + 7) { // 최솟값 보다 큼?
                    System.out.println(i);
                    break;
                }
            }
            i++;
        }
    }
}