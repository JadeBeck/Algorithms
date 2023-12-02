import java.io.*;
import java.util.*;

public class Main {
     public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        for(int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());  //a = dA
            int b = Integer.parseInt(st.nextToken());  //b = dB
            int gcd = gcd(a, b);

            sb.append(a * b / gcd).append('\n');  // (dA * dB)/d = dAB
        }
        System.out.println(sb);
    }

    // 최대공약수 반복문 방식
    public static int gcd(int a, int b) {
        while (b != 0) {
            int r = a % b; // 나머지를 구해준다. a = qb + r
            // long -> 기본 자료형 타입(Primitive Type), Long -> 래퍼 클래스(Wrapper Class)
            //래퍼 클래스는 기본 자료형을 참조자료형으로 사용하기 위한 것
            //기본 자료형은 null로 초기화 불가능, 래퍼 클래스는 가능

            // GCD(a, b) = GCD(b, r)이므로 변환한다.
            a = b;
            b = r;
        }
        return a;
    }
}