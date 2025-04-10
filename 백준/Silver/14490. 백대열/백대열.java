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
        int a = Integer.parseInt(parts[0]);
        int b = Integer.parseInt(parts[1]);
        bw.write((a / gcd(a, b)) + ":" + (b / gcd(a, b)));
        bw.flush();
        bw.close();
        br.close();
    }
    public static int gcd(int a, int b) {
        int temp;
        while (b > 0) {
            temp = a;
            a = b;
            b = temp % b;
        }
        return a;
    }
}