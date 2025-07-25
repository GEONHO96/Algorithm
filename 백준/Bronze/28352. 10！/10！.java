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
        long factorial = 1;
        for (int i = N ; i >= 1; i--) {
            factorial *= i;
        }
        long week =  factorial / (7 * 24 * 60 * 60);
        bw.write(String.valueOf(week));
        bw.flush();
        bw.close();
        br.close();
    }
}