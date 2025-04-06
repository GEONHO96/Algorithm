import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            String operation = br.readLine();
            if (operation.equals("P=NP")) {
                bw.write("skipped" + "\n");
            }
            else {
                String[] parts = operation.split("\\+");
                int a = Integer.parseInt(parts[0]);
                int b = Integer.parseInt(parts[1]);
                bw.write(String.valueOf(a + b) + "\n");
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}