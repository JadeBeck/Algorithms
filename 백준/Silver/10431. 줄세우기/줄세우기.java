//import java.util.*;
//import java.io.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int totalCnt = Integer.parseInt(br.readLine());

        while(totalCnt > 0) {
            totalCnt--;

            StringTokenizer st = new StringTokenizer(br.readLine());
            int testCaseNo = Integer.parseInt(st.nextToken());
            int result = 0;

            //배열 넣기
            Integer arr[] = new Integer[20];
            for (int i = 0; i < 20; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            //순서 정렬
            for (int i = 1; i < 20; i++) {
                //현재 순서 정해야하는 arr[i]기준으로 앞에있는 애들 키 비교
                for (int j = i-1; j >= 0; j--) {
                    if(arr[j] > arr[i])
                        result++;
                }
            }
            System.out.println(testCaseNo+" "+result);
        }
    }
}