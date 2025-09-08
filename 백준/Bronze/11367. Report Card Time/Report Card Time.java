import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        while (n-- > 0) {
            String[] parts = br.readLine().split(" ");
            String a = parts[0];
            int b = Integer.parseInt(parts[1]);
            if (b >= 97) bw.write(a + " A+\n");
            else if (b >= 90) bw.write(a + " A\n");
            else if (b >= 87) bw.write(a + " B+\n");
            else if (b >= 80) bw.write(a + " B\n");
            else if (b >= 77) bw.write(a + " C+\n");
            else if (b >= 70) bw.write(a + " C\n");
            else if (b >= 67) bw.write(a + " D+\n");
            else if (b >= 60) bw.write(a + " D\n");
            else if (b >= 0) bw.write(a + " F\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}