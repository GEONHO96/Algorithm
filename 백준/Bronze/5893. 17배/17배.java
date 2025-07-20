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
        String N = br.readLine();
        BigInteger binary = new BigInteger(N, 2);
        BigInteger result = binary.multiply(BigInteger.valueOf(17));
        bw.write(result.toString(2));
        bw.flush();
        bw.close();
        br.close();
    }
}