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
        int x1 = Integer.parseInt(st.nextToken());
        int x2 = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());
        int definiteIntegral = ((a * x2 * x2 * x2) / 3 + (b * x2 * x2) / 2 + (c * x2) - (d * x2 * x2) / 2 - (e * x2)) - ((a * x1 * x1 * x1) / 3 + (b * x1 * x1) / 2 + (c * x1) - (d * x1 * x1) / 2 - (e * x1));
        bw.write(definiteIntegral + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}