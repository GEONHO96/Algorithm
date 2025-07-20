import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        while (N-- > 0) {
            String[] binary = br.readLine().split(" ");
            BigInteger M = new BigInteger(binary[0], 2);
            BigInteger K = new BigInteger(binary[1], 2);
            BigInteger result = M.add(K);
            bw.write(result.toString(2) + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}