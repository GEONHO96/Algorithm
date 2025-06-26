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
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(br.readLine());
        int minClick = Math.abs(A - B);
        for (int i = 0; i < N; i++) {
            int fav = Integer.parseInt(br.readLine());
            int click = 1 + Math.abs(fav - B);
            if (click < minClick) {
                minClick = click;
            }
        }
        bw.write(minClick + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}