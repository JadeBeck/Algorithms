import java.io.*;
import java.util.*;

public class Main {
     public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String[] inputs = br.readLine().split(" ");
        int N = Integer.parseInt(inputs[0]);
        int M = Integer.parseInt(inputs[1]);

        HashMap<String, Integer> frequency = new HashMap<>();

        for (int i = 0; i < N; i++) {
            String word = br.readLine();
            if (word.length() < M) continue;

            frequency.put(word, frequency.getOrDefault(word, 0) + 1);
        }

        String[] word_list = frequency.keySet().toArray(new String[frequency.size()]);

        Arrays.sort(word_list, (a, b) -> {
            int compare_by_frequency = frequency.get(b) - frequency.get(a);
            if (compare_by_frequency != 0) return compare_by_frequency;
            else {
                int compare_by_length = b.length() - a.length();
                if (compare_by_length != 0) return compare_by_length;
                else {
                    int compare_by_lexicographic = a.compareTo(b);
                    return compare_by_lexicographic;
                }
            }
        });

        for (String word : word_list) sb.append(word).append("\n");

        System.out.println(sb);
        br.close();
    }
}