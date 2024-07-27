import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //노드 개수
        int m = sc.nextInt(); //간선 개수

        //위상정렬
        //큐, 진입차수 배열 필요
        //이차원 arrList 필요, 해당 학생 다음에 와야하는 학생들을 삽입
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        for (int i = 0; i <= n; i++) arr.add(new ArrayList<>());

        int[] inDegree = new int[n + 1]; //진입 차수 배열, 인덱스가 해당 학생을 의미

        for (int i = 0; i < m; i++) {
            int front = sc.nextInt();
            int back = sc.nextInt();
            arr.get(front).add(back);
            inDegree[back]++;
        }

        Queue<Integer> Q = new LinkedList<>(); //큐에다가 진입차수가 0인 학생을 넣을거임
        for (int i = 1; i <= n; i++) if (inDegree[i] == 0) Q.offer(i);

        while (!Q.isEmpty()) { //큐가 빌 때까지
            int now = Q.poll();  //큐에서 학생 번호 꺼내기
            System.out.println(now + " ");  //꺼낸 학생은 res에 담고 연결된 간선을 없앤다

            for (int next : arr.get(now)) {  //now랑 키를 비교한 정보의 개수 만큼 반복문 실행
                inDegree[next]--;  //now보다 뒤에 서야 하는 학생의 진입차수 감소
                if (inDegree[next] == 0) Q.offer(next);  //감소한 인디그리가 0이면 큐에 학생 번호 넣기
            }
        }
    }
}