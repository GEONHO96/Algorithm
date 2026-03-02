import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Integer[] W = new Integer[10];
        Integer[] K = new Integer[10];
        for (int i = 0; i < 10; i++) {
            W[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(W, Collections.reverseOrder());
        for (int i = 0; i < 10; i++) {
            K[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(K, Collections.reverseOrder());
        int top3W = W[0] + W[1] + W[2];
        int top3K = K[0] + K[1] + K[2];
        bw.write(top3W + " " + top3K);
        bw.flush();
        bw.close();
        br.close();
    }
}