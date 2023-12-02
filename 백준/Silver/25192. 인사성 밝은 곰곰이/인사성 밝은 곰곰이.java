import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        HashSet<String> enter_member = new HashSet<>();

        int N = Integer.parseInt(br.readLine());
        int count = 0;

        for (int i = 0; i < N; i++) {
            String chat = br.readLine();

            if (chat.equals("ENTER")) {
                count += enter_member.size();

                enter_member = new HashSet<>();
            } else {
                enter_member.add(chat);
            }
        }
        count += enter_member.size();
        bw.write(count + "\n");

        br.close();
        bw.flush();
        bw.close();
    }
}
