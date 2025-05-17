import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int Q = Integer.parseInt(st.nextToken());
        int[] rhythms = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            rhythms[i] = Integer.parseInt(st.nextToken());
        }
        while (Q-- > 0) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int r = Integer.parseInt(st.nextToken());
            int change = 0;
            if (i == r) {
                bw.write("0\n");
            } else {
                for (int j = i; j < r; j++) {
                    change += Math.abs(rhythms[j] - rhythms[j - 1]);
                }
                bw.write(change + "\n");
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}