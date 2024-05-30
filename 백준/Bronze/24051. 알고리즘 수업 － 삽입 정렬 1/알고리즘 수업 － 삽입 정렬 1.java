import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 첫째 줄 입력: 배열의 크기 N과 저장 횟수 K
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        
        // 두번째 줄 입력: 배열의 원소들
        int[] A = new int[N + 1];  // 1-based 인덱싱을 위해 크기를 N+1로 설정
        for (int i = 1; i <= N; i++) {
            A[i] = scanner.nextInt();
        }
        
        // Insertion Sort 수행
        int saveCount = 0;  // 저장 횟수 카운트
        int result = -1;    // 결과 저장 변수, 초기값 -1
        
        for (int i = 2; i <= N; i++) {
            int loc = i - 1;
            int newItem = A[i];
            
            // A[1..i-1]은 이미 정렬되어 있는 상태
            while (loc >= 1 && newItem < A[loc]) {
                A[loc + 1] = A[loc];
                loc--;
                saveCount++;
                
                // 저장 횟수가 K에 도달했을 때의 값을 저장
                if (saveCount == K) {
                    result = A[loc + 1];
                }
            }
            if (loc + 1 != i) {
                A[loc + 1] = newItem;
                saveCount++;
                
                // 저장 횟수가 K에 도달했을 때의 값을 저장
                if (saveCount == K) {
                    result = A[loc + 1];
                }
            }
        }
        
        // 결과 출력
        System.out.println(result);
        
        scanner.close();
    }
}
