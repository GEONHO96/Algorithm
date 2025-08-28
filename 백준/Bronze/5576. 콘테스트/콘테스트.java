import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] W = new int[10];
        for (int i = 0; i < 10; i++) {
            W[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(W);
        int[] K = new int[10];
        for (int i = 0; i < 10; i++) {
            K[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(K);
        int sumW = W[7] + W[8] + W[9];
        int sumK = K[7] + K[8] + K[9];
        bw.write(sumW + " " + sumK);
        bw.flush();
        bw.close();
        br.close();
    }
}