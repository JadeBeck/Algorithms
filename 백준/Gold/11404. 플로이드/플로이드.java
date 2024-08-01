import java.io.*;
import java.util.*;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
    static int city_no, route_no;
    static int distance[][];
    
    public static void main(String[] args) throws IOException {
        city_no = Integer.parseInt(br.readLine());
        route_no = Integer.parseInt(br.readLine());
        distance = new int[city_no + 1][city_no + 1];
        
        for (int i = 0; i <= city_no; i++) {
            for (int j = 0; j <= city_no; j++) {
                if (i == j) distance[i][j] = 0;
                else distance[i][j] = 10000001;
            }
        }
        
        for (int i = 0; i < route_no; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            
            if (distance[s][e] > v) distance[s][e] = v;
        }
        
        //Floyd-Warshall Algorithm
        for (int k = 1; k <= city_no; k++) {
            for (int i = 1; i <= city_no; i++) {
                for (int j = 1; j <= city_no; j++) {
                    if (distance[i][j] > distance[i][k] + distance[k][j]) distance[i][j] = distance[i][k] + distance[k][j];
                }
            }
        }
        
        for (int i = 1; i <= city_no; i++) {
            for (int j = 1; j <= city_no; j++) {
                if (distance[i][j] == 10000001) System.out.print("0 ");
                else System.out.print(distance[i][j] + " ");
            }
            System.out.println();
        }
    }
}
