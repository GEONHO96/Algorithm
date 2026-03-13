import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            int C = Integer.parseInt(br.readLine());
            int quarter = C / 25;
            int dime = (C % 25) / 10;
            int nickel = (C % 25 % 10) / 5;
            int penny = C % 25 % 10 % 5;
            bw.write(quarter + " " + dime + " " + nickel + " " + penny + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}