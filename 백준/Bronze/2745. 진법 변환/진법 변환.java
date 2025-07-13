import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] split = br.readLine().split(" ");
        String N = split[0];
        int B = Integer.parseInt(split[1]);
        int A = Integer.parseInt(N, B);
        bw.write(String.valueOf(A));
        bw.flush();
        bw.close();
        br.close();
    }
}