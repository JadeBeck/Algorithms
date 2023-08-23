import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static long x1, y1, r1, x2, y2, r2;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        x1 = Long.parseLong(st.nextToken());
        y1 = Long.parseLong(st.nextToken());
        r1 = Long.parseLong(st.nextToken());

        st = new StringTokenizer(br.readLine());
        
        x2 = Long.parseLong(st.nextToken());
        y2 = Long.parseLong(st.nextToken());
        r2 = Long.parseLong(st.nextToken());

        if(Math.sqrt((x2 - x1)*(x2 - x1) + (y2 - y1)*(y2 - y1)) < r1 + r2) System.out.println("YES");
        else System.out.println("NO");
    }
}