import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        for (int i = 1; i <= T; i++) {
            int n = Integer.parseInt(br.readLine());
            Integer[] x = new Integer[n];
            Integer[] y = new Integer[n];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                x[j] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(x, Collections.reverseOrder());
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++){
                y[j] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(y);
            int vector = 0;
            for (int j = 0; j < n; j++) {
                vector += x[j] * y[j];
            }
            bw.write("Case #" + i + ": " + vector + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}