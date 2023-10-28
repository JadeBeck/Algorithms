import java.io.*;
import java.util.*;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 0001 -> 1번 도시 방문
// 1010 -> 2번, 4번 방문
// 1101 -> 1, 3, 4번 도시 방문
// dp[][] -> 현재 i번 도시에 있고, 거쳐온 도시가 j일 때, 남은 도시를 방문하는데 필요한 최소 비용
// dp[3][1100101] -> 1, 3, 6, 7 도시를 거쳐서 현재 3번 도시일 때 남은 2 4 5를 방문하는 데 드는 최소 비용
public class Main {
    static int N, allMask, INF = 999_999_999;
    static int[][] W;
    static int[][] dp;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());  //도시의 수
        W = new int[N][N];

        allMask = ( 1 << N ) - 1; // N 이 5이면 1<<5 => 100000 ==> 1을 빼면 11111 (5자리가 모두 1, 즉 모든 도시를 방문한 상태)
        dp = new int[N][allMask]; // ㅇㅎ............. 현재 i번 도시에 있고, 거쳐온 도시가 j일 때, 남은 도시를 방문하는데 필요한 최소 비용

        //단순하게 도시간 이동 비용 정리한 행렬
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                W[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // 0번째 도시에서 출발
        System.out.println(tsp(0, 1));
    }


    // 어느 도시에서 시작하든지 최소비용은 같기 때문에 편안하게 0번도시부터 시작하자
    // @param: city - 현재 위치한 도시 인덱스, visitBitMask - 지금까지 방문한 도시 2진수
    // DFS 알고리즘
    static int tsp(int city, int visitBitmask) {
        // 기저조건
        if( visitBitmask == allMask ) { // 모든 도시를 방문한 상태 이므로, 처음(0번째 도시) 으로 되돌아가는 비용 처리
            if(W[city][0] == 0) return INF;
            else return W[city][0];
        }

        // 더 도시를 방문해야 한다.
        if( dp[city][visitBitmask] != 0 ) return dp[city][visitBitmask];

        // 처음
        dp[city][visitBitmask] = INF;

        // 방문하지 않은 도시를 방문 (재귀)
        for (int i = 0; i < N; i++) {
            // 갈수 없거나, 이미 방문한 경우는 skip
            if(W[city][i] == 0 || (visitBitmask & 1 << i) != 0) continue;

            dp[city][visitBitmask] = Math.min( dp[city][visitBitmask], tsp(i, visitBitmask | ( 1<< i) ) + W[city][i] );
        }

        return dp[city][visitBitmask];
    }
}