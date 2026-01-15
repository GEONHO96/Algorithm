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
        if (N == 1) bw.write("2024 8");
        if (N == 2) bw.write("2025 3");
        if (N == 3) bw.write("2025 10");
        if (N == 4) bw.write("2026 5");
        if (N == 5) bw.write("2026 12");
        bw.flush();
        bw.close();
        br.close();
    }
}