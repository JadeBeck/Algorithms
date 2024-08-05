import java.util.*;

public class Main {
    static int[][] tree;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        tree = new int[26][2];

        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String[] temp = sc.nextLine().split(" ");  //공백 기준 문자열 분리해서 그 '덩어리'가 temp라는 배열에 들어간 것. 글서 아래에서 charAt(0)해줌(물론 알파벳 딱 하나라서 '덩어리'가 이상하게 느껴지는게 맞음)

            int node = temp[0].charAt(0) - 'A';  //idx로 변환하기 위해 A 문자 빼기 
            char left = temp[1].charAt(0);
            char right = temp[2].charAt(0);

            if (left == '.') tree[node][0] = -1;
            else tree[node][0] = left - 'A';
            
            if (right == '.') tree[node][1] = -1;
            else tree[node][1] = right - 'A';
        }

        preOrder(0);
        System.out.println();
        midOrder(0);
        System.out.println();
        postOrder(0);
        System.out.println();
    }
    
     public static void preOrder(int now) {
        if (now == -1) return;
        System.out.print((char) (now + 'A'));
        preOrder(tree[now][0]);
        preOrder(tree[now][1]);
    }

    public static void midOrder(int now) {
        if (now == -1) return;
        midOrder(tree[now][0]);
        System.out.print((char) (now + 'A'));
        midOrder(tree[now][1]);
    }

    public static void postOrder(int now) {
        if (now == -1) return;
        postOrder(tree[now][0]);
        postOrder(tree[now][1]);
        System.out.print((char) (now + 'A'));
    }
}
