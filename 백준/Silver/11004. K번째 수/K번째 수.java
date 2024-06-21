import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken()) - 1;

        int[] arr = new int[N];

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        quickSort(arr, 0, N - 1, K);
        bw.write(arr[K] + "\n");

        br.close();
        bw.flush();
        bw.close();
    }

    private static void quickSort(int[] arr, int start_idx, int end_idx, int K) {
        if (start_idx >= end_idx) return;
        int pivot_idx = partition(arr, start_idx, end_idx);
        if (pivot_idx == K) return;
        if (K < pivot_idx)
            quickSort(arr, start_idx, pivot_idx - 1, K);
        else
            quickSort(arr, pivot_idx + 1, end_idx, K);
    }

    private static int partition(int[] arr, int start_idx, int end_idx) {
        if (start_idx + 1 == end_idx) {
            if (arr[start_idx] > arr[end_idx]) {
                swap(arr, start_idx, end_idx);
                return end_idx;
            }
        }
        int middle = (start_idx + end_idx) / 2;
        swap(arr, start_idx, middle);
        int pivot_idx = start_idx;

        int i = start_idx + 1;
        int j = end_idx;
        while (i <= j) {
            while (i <= j && arr[pivot_idx] < arr[j]) j--;
            while (i <= j && arr[pivot_idx] > arr[i]) i++;
            if (i <= j) swap(arr, i++, j--);
        }
        int pivot_value = arr[pivot_idx];
        arr[start_idx] = arr[j];
        arr[j] = pivot_value;
        return j;
    }

    private static void swap(int[] arr, int i, int j) {
        if (i != j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}
