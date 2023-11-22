import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        char[][] ch = new char[5][15];    //2차원 배열 선언. 이때 2차원 배열의 단순 길이(ch.length())는 0행의 원소의 개수 즉 5개
        int max = 0;    //문자열 최대 길이 잡을 변수

        for (int i = 0; i < ch.length; i++) {
            String str = br.readLine();
            if (max < str.length()) max = str.length();

            for (int j = 0; j < str.length(); j++) {
                ch[i][j] = str.charAt(j);
            }
        }

        for (int i = 0; i < max; i++) {
            for (int j = 0; j < 5; j++) {    //세로로 읽으며 행과 열을 출력해야하니 ch[j][i]
                if (ch[j][i] == '\0') continue;    //char타입 2차원 배열의 초깃값은 '\0' 즉 빈 값(null)
                sb.append(ch[j][i]);    //continue는 해당 조건문 블록을 탈출하여 아래 명령문은 실행하지 않고, 다음 반복문 실행절차를 수행
            }
        }
        System.out.println(sb);
    }
}