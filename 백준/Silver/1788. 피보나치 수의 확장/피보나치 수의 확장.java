import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    static int MOD = 1_000_000_000;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int absN = Math.abs(n);
        int[] fib = new int[absN + 2];
        fib[0] = 0;
        fib[1] = 1;
        int sign;
        if (n == 0) {
            sign = 0;
        } else if (n > 0) {
            sign = 1;
        } else {
            sign = (n % 2 == 0) ? -1 : 1;
        }
        for (int i = 2; i <= absN; i++) {
            fib[i] = (fib[i - 1] + fib[i - 2]) % MOD;
        }
        bw.write(sign + "\n" + fib[absN] + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}