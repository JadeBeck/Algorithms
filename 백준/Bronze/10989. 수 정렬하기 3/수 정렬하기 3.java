import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] A = new int[N];

        for(int i = 0 ; i < N ; i++) A[i] = Integer.parseInt(br.readLine());

        radix_sort(A, 5);   // 기수 정렬 함수 수행

        StringBuilder sb = new StringBuilder();
        for(int i : A) sb.append(i + "\n");
        System.out.println(sb);
    }

    public static void radix_sort(int[] A, int max_size) {
        int[] output = new int[A.length];
        int jarisu = 1;
        int cnt = 0;

        // 최대 자리수만큼 반복
        while(cnt != max_size) {
            int[] bucket = new int[10];

            // 일의 자리부터 반복
            for(int i = 0; i < A.length; i++) bucket[(A[i] / jarisu) % 10]++;

            // 합 배열 이용해 idx 계산
            for(int i = 1 ; i < 10 ; i++) bucket[i] += bucket[i - 1];

            // 현재 자릿수 기준 정렬
            for(int i = A.length - 1 ; i >= 0 ; i--) {
                output[bucket[(A[i] / jarisu % 10)] - 1] = A[i];
                bucket[(A[i] / jarisu) % 10]--;
            }

            // 다음 자릿수 이동 위해 현재 자릿수 기준 정렬 데이터 저장
            for(int i = 0 ; i < A.length ; i++) A[i] = output[i];

            jarisu *= 10;   // 자리수 증가
            cnt++;
        }
    }
}

/*
11
215
15
344
372
294
100
8
145
24
198
931
*/