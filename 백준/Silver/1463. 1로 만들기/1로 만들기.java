import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] dp = new int[1000001];  //DP 배열 초기화. N의 범위가 10^6까지니까 크기가 1000001인 배열 선언해줌. N을 최소 횟수로 요리해서 1로 만들거임.

        dp[2] = 1;  //주어진 N이 2? 최소인 1회에 1로
        dp[3] = 1;  //주어진 N이 3? 최소인 1회에 1로

        //이제 나머지 숫자들도 해볼거임
        //이게 뭐하는거냐면. i가 4부터 하는거잖아. 그니까 dp배열에 지금 2, 3인 경우는 채워져 있고 4부터 없으니까 해줄거임(1은..? 암튼)
        //글서 4일때는 2로 나눠지는 경우니까 해당 구역에서, 음. 근데. 애당초 저 경우를 왜 네가지로나 if로 나눴냐면
        //예를들어 6으로 나눠지는 경우는, 걔를 2든 3이든 나눈 후(횟수 1회 추가됨 - 이것때문에 식의 마지막에 꼭 1씩 더해진 것)의 결과값은 이미 dp배열에 저장된 수일 수 있다는거임.
        //그러면 그걸 다시 계산할 필요는 없는거잖아!!!ㅇㅇㅇ 그냥 dp배열에 이미 저장된 값을 갖다가 쓰기만 하면 됨.
        for (int i = 4; i <= n; i++) {
            if (i % 6 == 0) {
                //6으로 나눠지면 3으로 나눠지는 경우, 2로 나눠지는 경우 둘 다 확인
                dp[i] = Math.min(dp[i / 3], Math.min(dp[i / 2], dp[i - 1])) + 1;
            } else if (i % 3 == 0) {
                //3으로 나눠지는 경우
                dp[i] = Math.min(dp[i / 3], dp[i - 1]) + 1;
            } else if (i % 2 == 0) {
                //2로 나눠지는 경우
                dp[i] = Math.min(dp[i / 2], dp[i - 1]) + 1;
            } else {
                //나눠지지 않는 경우
                dp[i] = dp[i - 1] + 1;
            }
        }
        System.out.print(dp[n]);
    }
}