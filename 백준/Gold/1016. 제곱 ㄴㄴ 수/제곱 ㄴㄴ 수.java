import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long Min = sc.nextLong();
        long Max = sc.nextLong();

        // Min을 고려하지 않고 Max+1 크기로 배열 생성
        boolean[] Check = new boolean[(int) (Max - Min + 1)];

        for (long i = 2; i * i <= Max; i++) {
            long pow = i * i;
            long start_index = Min / pow;

            if (Min % pow != 0) start_index++;

            for (long j = start_index; pow * j <= Max; j ++) Check[(int) ((j * pow) - Min)] = true;
        }

        int cnt = 0;
        for (long i = 0; i <= Max - Min; i++) if (!Check[(int) i]) cnt++;

        System.out.println(cnt);
    }
}
