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
            String[] input = br.readLine().split(" ");
            bw.write("god");
            for (int i = 1; i < input.length; i++) {
                bw.write(input[i]);
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}