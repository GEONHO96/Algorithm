import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.Set;
import java.util.HashSet;

public class Main {
    private static int getClockNumber(int[] arr) {
        int minValue = Integer.MAX_VALUE;
        for (int i = 0; i < 4; i++) {
            int num = arr[i] * 1000 + arr[(i + 1) % 4] * 100 + arr[(i + 2) % 4] * 10 + arr[(i + 3) % 4];
            minValue = Math.min(minValue, num);
        }
        return minValue;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] clockNumber = new int[4];
        for (int i = 0; i < 4; i++) {
            clockNumber[i] = Integer.parseInt(st.nextToken());
        }
        int targetClockNumber = getClockNumber(clockNumber);
        int count = 0;
        Set<Integer> uniqueClockNumbers = new HashSet<>();
        for (int i = 1111; i <= targetClockNumber; i++) {
            int[] digits = {i / 1000, (i / 100) % 10, (i / 10) % 10, i % 10};
            if (digits[0] == 0 || digits[1] == 0 || digits[2] == 0 || digits[3] == 0) {
                continue;
            }
            int clockNum = getClockNumber(digits);
            if (!uniqueClockNumbers.contains(clockNum)) {
                uniqueClockNumbers.add(clockNum);
                count++;
            }
        }
        bw.write(count + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}