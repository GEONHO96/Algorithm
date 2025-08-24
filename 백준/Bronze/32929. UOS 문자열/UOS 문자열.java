import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int x = Integer.parseInt(br.readLine());
        if (x % 3 == 0) bw.write("S");
        if (x % 3 == 1) bw.write("U");
        if (x % 3 == 2) bw.write("O");
        bw.flush();
        bw.close();
        br.close();
    }
}