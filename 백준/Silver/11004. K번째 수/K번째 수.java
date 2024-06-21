import java.io.*;
import java.util.*;

public class Main {

    static int[] arr;
    static int K;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken()) - 1;

        arr = new int[N];

        st = new StringTokenizer(br.readLine(), " ");

        for(int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        quickSort(0, N-1);
        bw.write(arr[K]+"");

        br.close();
        bw.flush();
        bw.close();
    }//void Main


    private static void quickSort(int start_idx, int end_idx) {
        if(start_idx >= end_idx) return;
        int pivot_idx = partition(start_idx, end_idx); //start와 end 영역 내에서 퀵 정렬을 한 단계 수행한 결과 pivot의 인덱스.
        //pivot의 인덱스가 2라는 것은, 0번 1번 인덱스에는 arr[pivot]보다 작은 값이, 3이상의 인덱스에는 arr[pivot]보다 큰 값들이 모여있다는 뜻이다.
        //따라서 pivot의 인덱스는 정렬이 완료된 위치이다.
        if(pivot_idx == K) return; //문제의 조건에 따라 배열의 K번 인덱스 값만 구하면 되므로 정렬을 중단해도 됨.
        quickSort(start_idx, pivot_idx - 1);
        quickSort(pivot_idx + 1, end_idx);

    }

    private static int partition(int start_idx, int end_idx) {
        //주어진 탐색 영역을 피벗 기준으로 작은수, 큰 수로 분류하고 피벗의 위치를 리턴함.
        if(start_idx + 1 == end_idx) { //탐색 영역이 길이가 2일 때는 바로 정렬하면 됨.(start, end 포함)
            if(arr[start_idx] > arr[end_idx]) {
                swap(start_idx, end_idx);
                return end_idx;
            }
        }
        int middle = (start_idx + end_idx) / 2; //start와 end의 중앙
        swap(start_idx, middle); //시작값과 중앙값을 swap
        int pivot_idx = start_idx; //시작 위치를 pivot으로.

        int i = start_idx + 1; //좌측 커서
        int j = end_idx; //우측 커서
        // i ~ j 범위 내에서 커서 이동
        while(i <= j) {
            //피벗 우측엔 더 큰 값을, 좌측엔 더 작은 값.
            while (i <= j && arr[pivot_idx] < arr[j]) j--;
            while (i <= j && arr[pivot_idx] > arr[i]) i++;
            if(i <= j) swap(i++, j--);
        }
        //왼쪽 커서가 오른쪽 커서를 교차한 경우.
        int pivot_value = arr[pivot_idx];  //
        arr[start_idx] = arr[j];  //start_idx의 값을 j 위치로 이동시킴. 여기서 j는 피벗의 최종 위치가 될 idx. 이를 통해 start_idx는 현재 피벗 값이 없어진 상태가 됨.
        arr[j] = pivot_value;  //피벗 값을 j 위치로 이동시킴. 이제 피벗 값이 j 위치에 배치됨.
        return j; //j를 반환하여 피벗값의 최종 idx 알려줌. 다음 영역은 j의 앞뒤로 나누면 됨.
    }

    private static void swap(int i, int j) {  //i, j는 idx but 밑에서는 걔들의 value swap
        int temp  = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}//class Main

/*
6 2
4 2 1 6 3 5
*/
