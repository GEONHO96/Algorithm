import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.TreeMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        TreeMap<String, Integer> extensionCount = new TreeMap<>();
        for (int i = 0; i < N; i++) {
            String fileName = br.readLine();
            String extension = fileName.substring(fileName.lastIndexOf(".") + 1);
            extensionCount.put(extension, extensionCount.getOrDefault(extension, 0) + 1);
        }
        for (Map.Entry<String, Integer> entry : extensionCount.entrySet()) {
            bw.write(entry.getKey() + " " + entry.getValue() + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}