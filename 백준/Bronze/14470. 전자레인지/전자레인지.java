import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());
        int D = Integer.parseInt(br.readLine());
        int E = Integer.parseInt(br.readLine());
        int time = 0;
        if (A < 0) {
            time = Math.abs(A) * C + D + B * E;
        } else if (A == 0) {
            time = D + B * E;
        } else {
            time = (B - A) * E;
        }
        bw.write(String.valueOf(time));
        bw.flush();
        bw.close();
        br.close();
    }
}