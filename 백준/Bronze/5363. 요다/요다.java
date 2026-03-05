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
        while (N-- > 0) {
            String[] yoda = br.readLine().split(" ");
            int length = yoda.length;
            for (int i = 2; i < length; i++) {
                bw.write(yoda[i] + " ");
            }
            bw.write(yoda[0] + " " + yoda[1] + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}