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
        String octal = br.readLine();
        BigInteger decimal = new BigInteger(octal, 8);
        String binary = decimal.toString(2);
        bw.write(binary);
        bw.flush();
        bw.close();
        br.close();
    }
}