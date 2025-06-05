import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Set;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            int n = Integer.parseInt(br.readLine());
            Set<String> cities = new HashSet<>();
            for (int i = 0; i < n; i++) {
                String city = br.readLine();
                cities.add(city);
            }
            bw.write(cities.size() + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}