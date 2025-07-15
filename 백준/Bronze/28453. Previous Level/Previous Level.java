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
        int[] level = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            level[i] = Integer.parseInt(st.nextToken());
            if (level[i] == 300) bw.write(1 + " ");
            if (level[i] >= 275 && level[i] < 300) bw.write(2 + " ");
            if (level[i] >= 250 && level[i] < 275) bw.write(3 + " ");
            if (level[i] < 250) bw.write(4 + " ");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}