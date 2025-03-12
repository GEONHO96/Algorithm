import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.Map;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());
        Map<Integer, Integer> seen = new HashMap<>();
        int count = 0;
        int current = A;
        while (!seen.containsKey(current)) {
            seen.put(current, count);
            count++;
            current = nextNum(current, P);
        }
        bw.write(String.valueOf(seen.get(current)));
        bw.flush();
        bw.close();
        br.close();
    }
    private static int nextNum(int num, int p) {
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            int temp = 1;
            for (int i = 0; i < p; i++) {
                temp *= digit;
            }
            sum += temp;
            num /= 10;
        }
        return sum;
    }
}