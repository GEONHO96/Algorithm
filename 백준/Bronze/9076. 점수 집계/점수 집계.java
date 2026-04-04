import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            int[] N = new int[5];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < 5; i++) {
                N[i] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(N);
            if (N[3] - N[1] >= 4) bw.write("KIN\n");
            else bw.write(N[1] + N[2] + N[3] + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}