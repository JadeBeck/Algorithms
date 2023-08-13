import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        BigInteger number;
        for (int i = 0; i < n; i++) {
            number = new BigInteger(br.readLine());
            System.out.println(number.multiply(number));
        }
    }
}