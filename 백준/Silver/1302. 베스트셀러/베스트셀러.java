import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            String title = br.readLine();
            map.put(title, map.getOrDefault(title, 0) + 1);
        }
        String bestSeller = "";
        int max = 0;
        for (String key : map.keySet()) {
            int count = map.get(key);
            if (count > max || (count == max && key.compareTo(bestSeller) < 0)) {
                max = count;
                bestSeller = key;
            }
        }
        bw.write(bestSeller + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}