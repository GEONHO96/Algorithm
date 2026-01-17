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
            int maxGCD = 0;
            String[] input = br.readLine().split(" ");
            int length = input.length;
            for (int i = 0; i < length - 1; i++) {
                for (int j = i + 1; j < length; j++) {
                    int gcd = gcd(Integer.parseInt(input[i]), Integer.parseInt(input[j]));
                    maxGCD = Math.max(maxGCD, gcd);
                }
            }
            bw.write(maxGCD + "\n");
        }
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