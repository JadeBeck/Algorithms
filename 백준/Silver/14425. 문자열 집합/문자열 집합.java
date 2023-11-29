import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        Map<String, Integer> word = new HashMap<>();
        for (int i = 0; i < N; i++) {
            word.put(br.readLine(), 1);
        }
        
        int count = 0;
        for (int i = 0; i < M; i++) {
            String check = br.readLine();
            
            if (word.get(check) != null) count++;
        }
        
        System.out.print(count);
        
    }
}