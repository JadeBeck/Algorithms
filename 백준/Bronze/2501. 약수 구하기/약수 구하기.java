import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        List<Integer> divisor = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            if (N % i == 0) divisor.add(i);
        }

        if (divisor.size() > K-1) System.out.println(divisor.get(K-1));
        else System.out.println(0);
    }
}