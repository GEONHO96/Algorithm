import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        HashMap<String, String> map = new HashMap<>();
        while (N-- > 0) {
            String[] input = br.readLine().split(" ");
            String address = input[0];
            String password = input[1];
            map.put(address, password);
        }
        for (int i = 0; i < M; i++) {
            String address = br.readLine();
            bw.write(map.get(address) + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}