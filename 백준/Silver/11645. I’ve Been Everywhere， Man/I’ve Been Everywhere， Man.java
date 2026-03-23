import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            HashSet<String> set = new HashSet<>();
            int n = Integer.parseInt(br.readLine());
            while (n-- > 0) {
                String name = br.readLine();
                set.add(name);
            }
            bw.write(set.size() + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}