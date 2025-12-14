import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            int cntTTT = 0;
            int cntTTH = 0;
            int cntTHT = 0;
            int cntTHH = 0;
            int cntHTT = 0;
            int cntHTH = 0;
            int cntHHT = 0;
            int cntHHH = 0;
            String input = br.readLine();
            int length = input.length();
            for (int i = 0; i < length - 2; i++) {
                if (input.substring(i, i + 3).equals("TTT")) cntTTT++;
                if (input.substring(i, i + 3).equals("TTH")) cntTTH++;
                if (input.substring(i, i + 3).equals("THT")) cntTHT++;
                if (input.substring(i, i + 3).equals("THH")) cntTHH++;
                if (input.substring(i, i + 3).equals("HTT")) cntHTT++;
                if (input.substring(i, i + 3).equals("HTH")) cntHTH++;
                if (input.substring(i, i + 3).equals("HHT")) cntHHT++;
                if (input.substring(i, i + 3).equals("HHH")) cntHHH++;
            }
            bw.write(cntTTT + " " + cntTTH + " " + cntTHT + " " + cntTHH + " " + cntHTT + " " + cntHTH + " " + cntHHT + " " + cntHHH + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}