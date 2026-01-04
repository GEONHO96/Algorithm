import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += arr[i];
        }
        int avg = sum / 5;
        int median = arr[2];
        bw.write(String.valueOf(avg) + "\n" + String.valueOf(median));
        bw.flush();
        bw.close();
        br.close();
    }
}