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
        int M = Integer.parseInt(st.nextToken());
        if (N == 0) {
            bw.write("0\n");
            bw.flush();
            bw.close();
            br.close();
            return;
        }
        int[] book = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            book[i] = Integer.parseInt(st.nextToken());
        }
        int currentWeight = 0;
        int boxCount = 1;
        for (int i = 0; i < N; i++) {
            if (currentWeight + book[i] > M) {
                boxCount++;
                currentWeight = book[i];
            } else {
                currentWeight += book[i];
            }
        }
        bw.write(boxCount +  "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}