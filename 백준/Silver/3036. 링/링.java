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
        String[] input = br.readLine().split(" ");
        int r1 = Integer.parseInt(input[0]);
        for (int i = 1; i < N; i++) {
            int r_i = Integer.parseInt(input[i]);
            int gcd = gcd(r1, r_i);
            bw.write((r1 / gcd) + "/" + (r_i / gcd) + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
    private static int gcd(int a, int b) {
        int temp;
        while (b > 0) {
            temp = a;
            a = b;
            b = temp % b;
        }
        return a;
    } 
}
