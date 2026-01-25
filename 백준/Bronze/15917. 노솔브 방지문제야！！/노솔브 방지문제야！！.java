import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int Q = Integer.parseInt(br.readLine());
        for (int i = 0; i < Q; i++) {
            boolean satisfied = true;
            int a = Integer.parseInt(br.readLine());
            while (a > 0) {
                if (a % 2 == 0) {
                    a /= 2;
                } else if (a % 2 != 0 && a != 1) {
                    satisfied = false;
                    break;
                } else if (a % 2 != 0 && a == 1) {
                    satisfied = true;
                    break;
                }
            }
            if (satisfied) bw.write("1\n");
            else bw.write("0\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}