import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        bw.write(String.valueOf(factorial(N)));
        bw.flush();
        bw.close();
        br.close();
    }
    public static int factorial(int N) {
        int temp = 1;
        for (int i = N; i >= 1; i--) {
            temp *= i;
        }
        return temp;
    }
}