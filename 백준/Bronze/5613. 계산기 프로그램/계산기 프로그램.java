import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int a = Integer.parseInt(br.readLine());
        while (true) {
            String operation = br.readLine();
            if (operation.equals("=")) {
                break;
            } else if (operation.equals("+")) {
                int b = Integer.parseInt(br.readLine());
                a += b;
            } else if (operation.equals("-")) {
                int b = Integer.parseInt(br.readLine());
                a -= b;
            } else if (operation.equals("*")) {
                int b = Integer.parseInt(br.readLine());
                a *= b;
            } else if (operation.equals("/")) {
                int b = Integer.parseInt(br.readLine());
                a /= b;
            }
        }
        bw.write(String.valueOf(a));
        bw.flush();
        bw.close();
        br.close();
    }
}