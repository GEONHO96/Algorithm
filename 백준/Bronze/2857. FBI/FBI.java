import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int cnt = 0;
        for (int i = 1; i <= 5; i++) {
            String agent = br.readLine();
            int length = agent.length();
            boolean satisfied = false;
            for (int j = 0; j < length - 2; j++) {
                if (agent.substring(j, j + 3).equals("FBI")) {
                    cnt++;
                    satisfied = true;
                    break;
                }
            }
            if (satisfied) bw.write(i + " ");
        }
        if (cnt == 0) bw.write("HE GOT AWAY!");
        bw.flush();
        bw.close();
        br.close();
    }
}