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
        int N = Integer.parseInt(br.readLine());
        int[] result = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int tallerCount = Integer.parseInt(st.nextToken());
            int count = 0;
            for (int j = 0; j < N; j++) {
                if (result[j] == 0) {
                    if (count == tallerCount) {
                        result[j] = i + 1;
                        break;
                    }
                    count++;
                }
            }
        }
        for (int i = 0; i < N; i++) {
            bw.write(result[i] + " ");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}