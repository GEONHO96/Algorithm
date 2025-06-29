import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = br.readLine();
        if (!input.contains("7") && Integer.parseInt(input) % 7 != 0) bw.write("0");
        if (!input.contains("7") && Integer.parseInt(input) % 7 == 0) bw.write("1");
        if (input.contains("7") && Integer.parseInt(input) % 7 != 0) bw.write("2");
        if (input.contains("7") && Integer.parseInt(input) % 7 == 0) bw.write("3");
        bw.flush();
        bw.close();
        br.close();
    }
}