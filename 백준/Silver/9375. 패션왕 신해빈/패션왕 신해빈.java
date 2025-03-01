import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Map;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            Map<String, Integer> clothesMap = new HashMap<>();
            for (int i = 0; i < n; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                String itemName = st.nextToken();
                String category = st.nextToken();
                clothesMap.put(category, clothesMap.getOrDefault(category, 0) + 1);
            }
            int result = 1;
            for (int count : clothesMap.values()) {
                result *= count + 1;
            }
            bw.write((result - 1) + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}