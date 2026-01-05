import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        String str = String.valueOf(N);
        int length = str.length();
        Integer[] arr = new Integer[length];
        for (int i = 0; i < length; i++) {
            arr[i] = Integer.parseInt(String.valueOf(str.charAt(i)));
        }
        Arrays.sort(arr, Collections.reverseOrder());
        for (int i = 0; i < length; i++) {
            bw.write(String.valueOf(arr[i]));
        }
        bw.flush();
        bw.close();
        br.close();
    }
}