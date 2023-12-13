import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 
public class Main {
	
	public static Long[] seq = new Long[101];
 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		seq[0] = 0L;
		seq[1] = 1L;
		seq[2] = 1L;
		seq[3] = 1L;
		
		int T = Integer.parseInt(br.readLine());		
		while(T-- > 0) { //이거는... T 개수만큼 돌려고 하는 것..... 예제로 여러개가 들어오고, 그 여러개 다 결과 뽑는거라궁
			sb.append(padovan(Integer.parseInt(br.readLine()))).append('\n');
		}
		System.out.println(sb);
	}
	
	public static long padovan(int N) {
		if(seq[N] == null) {
			seq[N] = padovan(N - 2) + padovan(N - 3);
		}
		return seq[N];
	}
}