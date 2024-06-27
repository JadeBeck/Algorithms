import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class Main {
    static ArrayList<Integer>[] A;  //각 요소가 ArrayList<Integer>인 배열 A를 선언(초기화는 되지 않고 공간만 할당받기에 모든 요소가 null임. 그러므로 각 요소를 ArrayList<Integer>로 초기화하는 과정이 필요)
    static boolean[] visited;

    public static void main(String[] args) throws IOException{
        BufferedReader bf =new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        A = new ArrayList[N+1];
        visited = new boolean[N+1];
        for (int i = 1; i < N +1; i++) A[i] = new ArrayList<>(); // 연결 리스트 초기화하기

        for (int i = 0; i < M; i++) {  //배열의 각 요소(연결리스트) 채워주기
            st = new StringTokenizer(bf.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            A[s].add(e);  //방향 없는 양방향 엣지니까
            A[e].add(s);  //양쪽으로 다 엣지 더하기
        }

       /* for (int i = 1; i < A.length; i++) {
            System.out.print("Node " + i + ": ");
            for (int j : A[i]) System.out.print(j + " ");
            System.out.println();
        }*/

        int count = 0;
        for (int i = 1; i < N + 1; i++) {
            if (!visited[i]) {  //방문 노드가 아닐 경우
                count++;  //DFS 횟수를 답으로 출력할것임
                DFS(i);  //방문하지 않은 노드가 없을 때까지 재귀
            }
        }
        System.out.println(count);
    }

    static void DFS(int v) {
        //현재 노드가 방문 노드면
        if (visited[v]) return;  //탐색 중지

        visited[v] = true;  //위에서 방문 노드가 아닐 경우, 지금 방문할거니까 방문 여부 T로 바꾸고
        for (int i : A[v]) {  //i 노드랑 연결된 모든 노드를 탐색하면서(A[v]는 v 노드에 연결된 모든 노드들이 저장된 ArrayList<Integer>임. 즉, v = 1일 때, A[1]은 노드 1에 연결된 모든 노드들의 리스트.)
            if (!visited[i]) DFS(i);  //연결 노드중 방문x 노드만 탐색하기. 빙문x노드 기준으로 다시 DFS 호출
        }

        /*
        for (int j = 0; j < A[v].size(); j++) {  //위의 foreach ➱ for문. 저 foreachrk A[v]의 모든 요소에 대해 반복한다는거임.
        int i = A[v].get(j);  //그니까... i가 0부터 시작이 아니라, A[v]의 요소를 훑는거니까 v = 1일 때 A[1] = 2, 5니까 2부터 시작이 맞음. 그걸 for문으로 표현하려면 지금 이 한 줄이 더 필요한거고.
        if (!visited[i]) DFS(i);
        }
        */
    }
}