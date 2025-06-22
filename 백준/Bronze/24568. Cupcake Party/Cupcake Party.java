import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int R = Integer.parseInt(br.readLine());
        int S = Integer.parseInt(br.readLine());
        int leftovers = R * 8 + S * 3 - 28;
        bw.write(String.valueOf(leftovers));
        bw.flush();
        bw.close();
        br.close();
    }
}