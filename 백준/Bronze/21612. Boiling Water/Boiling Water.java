import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int B = Integer.parseInt(br.readLine());
        int P = 5 * B - 400;
        bw.write(P + "\n");
        if (P < 100) bw.write("1");
        else if (P == 100) bw.write("0");
        else bw.write("-1");
        bw.flush();
        bw.close();
        br.close();
    }
}