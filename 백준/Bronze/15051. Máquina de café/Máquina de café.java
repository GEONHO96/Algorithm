import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int A1 = Integer.parseInt(br.readLine());
        int A2 = Integer.parseInt(br.readLine());
        int A3 = Integer.parseInt(br.readLine());
        int case1 = A2 * 2 + A3 * 4;
        int case2 = A1 * 2 + A3 * 2;
        int case3 = A1 * 4 + A2 * 2;
        int result = Math.min(case1, Math.min(case2, case3));
        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
        br.close();
    }
}