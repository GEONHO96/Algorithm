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
        String[] split = br.readLine().split(" ");
        BigInteger N = new BigInteger(split[0], 2);
        BigInteger M = new BigInteger(split[1], 2);
        BigInteger result = N.add(M);
        bw.write(result.toString(2));
        bw.flush();
        bw.close();
        br.close();
    }
}