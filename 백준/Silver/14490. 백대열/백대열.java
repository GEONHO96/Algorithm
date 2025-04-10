import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String percentage = br.readLine();
        String[] parts = percentage.split(":");
        int n = Integer.parseInt(parts[0]);
        int m = Integer.parseInt(parts[1]);
        bw.write(n / gcd(n, m) + ":" + m / gcd(n, m));
        bw.flush();
        bw.close();
        br.close();
    }
    public static int gcd(int n, int m) {
        int temp;
        while (m > 0) {
            temp = n;
            n = m;
            m = temp % m;
        }
        return n;
    }
}