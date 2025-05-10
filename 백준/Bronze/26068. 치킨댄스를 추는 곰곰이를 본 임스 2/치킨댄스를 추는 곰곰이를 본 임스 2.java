import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new
            BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int count = 0;
        for (int i = 0; i < N; i++) {
            String x = br.readLine();
            String[] parts = x.split("-");
            int a = Integer.parseInt(parts[1]);
            if (a <= 90) count++;
        }
        bw.write(count + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}