import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] tokens = br.readLine().split(" ");
        int count = 0;
        for (String token : tokens) {
            if (!token.isEmpty()) {
                int num = Integer.parseInt(token);
                if (num > 0) count++;
            }
        }
        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
        br.close();
    }
}