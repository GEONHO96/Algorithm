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
        int[] N = new int[8];
        int cnt = -1;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 8; i++) {
            N[i] = Integer.parseInt(st.nextToken());
        }
        for (int i = 0; i < 8; i++) {
            if (N[i] == 9) cnt++;
        }
        if (cnt >= 0) bw.write("F");
        else bw.write("S");
        bw.flush();
        bw.close();
        br.close();
    }
}