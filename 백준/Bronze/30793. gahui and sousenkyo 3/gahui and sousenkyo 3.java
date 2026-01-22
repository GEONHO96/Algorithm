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
        int p = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());
        if (p < v * 0.2) bw.write("weak");
        if (p >= v * 0.2 && p < v * 0.4) bw.write("normal");
        if (p >= v * 0.4 && p < v * 0.6) bw.write("strong");
        if (p >= v * 0.6) bw.write("very strong");
        bw.flush();
        bw.close();
        br.close();
    }
}