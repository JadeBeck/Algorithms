import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();  //각 건물에 대해 먼저 지어져야 하는 건물 리스트 저장
        for (int i = 0; i <= N; i++) list.add(new ArrayList<>());

        int[] inDegree = new int[N + 1];  //각 건물로 들어오는 간선(선행 조건) 수 저장하는 진입 차수 배열
        int[] time = new int[N + 1];  //각 건물 짓는데 걸리는 시간
        for (int i = 1; i <= N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());  //10 1 -1 이거면
            time[i] = Integer.parseInt(st.nextToken());  //10이 걸리는 시간이고

            while (true) {
                int num = Integer.parseInt(st.nextToken());  //1이. 지금 이 i번째 건물을 짓기 위해서 먼저 지어져야하는 건물인거임
                if (num == -1) break;

                list.get(num).add(i);
                inDegree[i]++;  //진입 차수 배열 초기화
            }
        }

        //Topological Sorting
        Queue<Integer> Q = new LinkedList<>();
        for (int i = 1; i <= N; i++) if (inDegree[i] == 0) Q.offer(i);

        int[] result = new int[N + 1];
        while (!Q.isEmpty()) {
            int now = Q.poll();

            for (int i = 0; i < list.get(now).size(); i++) {
                int next = list.get(now).get(i);  //여기 두 줄을 for (int next : list.get(now))로 바꿀 수도....

                inDegree[next]--;
                result[next] = Math.max(result[next], result[now] + time[now]);

                if (inDegree[next] == 0) Q.offer(next);
            }
        }

        for (int i = 1; i <= N; i++) System.out.println(result[i] + time[i]);
    }
}

/*
5
10 -1
10 1 -1
4 1 -1
4 3 1 -1
3 3 -1
* */