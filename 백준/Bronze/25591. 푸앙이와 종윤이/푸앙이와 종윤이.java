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
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int a = 100 - n;
        int b = 100 - m;
        int c = 100 - (a + b);
        int d = a * b;
        int q = d / 100;
        int r = d % 100;
        int s = c + q;
        int t = r;
        bw.write(a + " " + b + " " + c + " " + d + " " + q + " " + r + "\n");
        bw.write(s + " " + t);
        bw.flush();
        bw.close();
    }
}