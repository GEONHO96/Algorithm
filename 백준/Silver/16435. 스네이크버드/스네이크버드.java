import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());
        int[] fruitLengths = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            fruitLengths[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(fruitLengths);
        long snakeBirdLength = L;
        for (int i = 0; i < N; i++) {
            if (snakeBirdLength >= fruitLengths[i]) snakeBirdLength++;
            else break;
        }
        bw.write(snakeBirdLength + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}