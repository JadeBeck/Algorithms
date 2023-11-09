import java.util.*;
import java.io.*;
 
public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
 
        System.out.println(solve(n));
    }
 
    public static String solve(int num){
        return num%2==1 ? "SK" :"CY";
    }
}