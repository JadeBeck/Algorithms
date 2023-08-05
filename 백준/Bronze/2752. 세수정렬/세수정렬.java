import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a, b, c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        
        int[] arr = {a, b, c};
        Arrays.sort(arr);
        
		for(int i = 0; i < arr.length; i++){ 
            System.out.println(arr[i]);
        }
    }
}