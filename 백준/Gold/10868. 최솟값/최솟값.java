import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static long[] tree;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int treeHeight = 0;
        int length = N;

        while (length != 0) {
            length /= 2;
            treeHeight++;
        }
        
        int treeSize = (int) Math.pow(2, treeHeight + 1);
        int leafNodeStartIdx = treeSize / 2 - 1;

        tree = new long[treeSize + 1];
        Arrays.fill(tree, Integer.MAX_VALUE);
        
        for (int i = leafNodeStartIdx + 1; i <= leafNodeStartIdx + N; i++) tree[i] = Long.parseLong(br.readLine());
        
        setTree(treeSize - 1);
        
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            start = start + leafNodeStartIdx;
            end = end + leafNodeStartIdx;

            System.out.println(getMin(start, end));
        }
    }
    
    private static void setTree(int i) {
        while (i != 1) {
            if (tree[i / 2] > tree[i]) tree[i / 2] = tree[i];
            i--;
        }
    }
    
    private static long getMin(int start, int end) {
        long Min = Long.MAX_VALUE;
        
        while (start <= end) {
            if (start % 2 == 1) {
                Min = Math.min(Min, tree[start]);
                start++;
            }
            start = start / 2;
            
            if (end % 2 == 0) {
                Min = Math.min(Min, tree[end]);
                end--;
            }
            end = end / 2;
        }
        return Min;
    }
}
