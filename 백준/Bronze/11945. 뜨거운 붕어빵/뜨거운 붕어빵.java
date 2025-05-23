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
        for (int i = 0; i < N; i++) {
            String bungeobbang = br.readLine();
            StringBuilder reverseBungeobbang = new StringBuilder();
            for (int j = 0; j < M; j++) {
                reverseBungeobbang.append(bungeobbang.charAt(M - 1 - j));
            }
            bw.write(reverseBungeobbang + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}