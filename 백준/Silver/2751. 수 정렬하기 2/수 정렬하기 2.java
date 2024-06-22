import java.io.*;

public class Main {
    public static int[] arr, tmp;
    public static long result;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        arr = new int[N+1];
        tmp = new int[N + 1];
        
        for (int i = 1; i <= N; i++) arr[i] = Integer.parseInt(br.readLine());
        mergeSort(1, N);

        for (int i = 1; i <= N; i++) {
            bw.write(arr[i] + "\n");
        }
        bw.flush();
        bw.close();
    }

    private static void mergeSort(int start_idx, int end_idx) {
        if (end_idx - start_idx < 1) return;

        int middle_idx = start_idx + (end_idx - start_idx) / 2;
        mergeSort(start_idx, middle_idx);
        mergeSort(middle_idx + 1, end_idx);
        
        for (int i = start_idx; i <= end_idx; i++) tmp[i] = arr[i];
        
        int k = start_idx;
        int index1 = start_idx;
        int index2 = middle_idx + 1;
        
        while (index1 <= middle_idx && index2 <= end_idx) {
            if (tmp[index1] > tmp[index2]) arr[k++] = tmp[index2++];
            else arr[k++] = tmp[index1++];
        }
        
        while (index1 <= middle_idx) arr[k++] = tmp[index1++];
        while (index2 <= end_idx) arr[k++] = tmp[index2++];
    }
}
/**
 5
 5
 4
 3
 2
 1
 */