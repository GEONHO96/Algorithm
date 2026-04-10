import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] currentDate = br.readLine().split("-");
        int N = Integer.parseInt(br.readLine());
        int cnt = 0;
        for (int i = 0; i < N; i++) {
            String[] expirationDate = br.readLine().split("-");
            if (Integer.parseInt(currentDate[0]) < Integer.parseInt(expirationDate[0])) {
                cnt++;
            }
            else if (Integer.parseInt(currentDate[0]) == Integer.parseInt(expirationDate[0]) && Integer.parseInt(currentDate[1]) < Integer.parseInt(expirationDate[1])) {
                cnt++;
            }
            else if (Integer.parseInt(currentDate[0]) == Integer.parseInt(expirationDate[0]) && Integer.parseInt(currentDate[1]) == Integer.parseInt(expirationDate[1]) && Integer.parseInt(currentDate[2]) <= Integer.parseInt(expirationDate[2])) {
                cnt++;
            }
        }
        bw.write(String.valueOf(cnt));
        bw.flush();
        bw.close();
        br.close();
    }
}