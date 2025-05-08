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
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        Integer[] h = new Integer[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            h[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(h, Collections.reverseOrder());
        Integer[] a = new Integer[M];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(a, Collections.reverseOrder());
        int maxDefense = h[0] + a[0];
        bw.write(maxDefense + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}