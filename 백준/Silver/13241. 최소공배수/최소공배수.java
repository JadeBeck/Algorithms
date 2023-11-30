import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
 
public class Main {
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();

        Long a = Long.parseLong(st.nextToken());  //a = dA
        Long b = Long.parseLong(st.nextToken());  //b = dB
        Long d = gcd(a, b);

        sb.append(a * b / d).append('\n');  // (dA * dB)/d = dAB

        System.out.println(sb);
    }

    // 최대공약수 반복문 방식
    public static Long gcd(Long a, Long b) {
        while (b != 0) {
            Long r = a % b; // 나머지를 구해준다.

            // GCD(a, b) = GCD(b, r)이므로 변환한다.
            a = b;
            b = r;
        }
        return a;
    }
}