import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int array[][] = new int[10][10];
        int max = 0;
        int x = 0;
        int y = 0;

        for (int i = 1; i <= 9; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 1; j <= 9; j++) {
                array[i][j] = Integer.parseInt(st.nextToken());

                if (max < array[i][j]) {
                    max = array[i][j];
                    x = i;
                    y = j;
                } else if (max == 0) {
                    x = 1;
                    y = 1;
                }
            }
        }
        System.out.println(max);
        System.out.println(x + " " + y);
    }
}