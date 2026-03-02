import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Integer[] arr = new Integer[8];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 8; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Integer[] ascArr = new Integer[8];
        for (int i = 0; i < 8; i++) {
            ascArr[i] = arr[i];
        }
        Arrays.sort(ascArr);
        Integer[] descArr = new Integer[8];
        for (int i = 0; i < 8; i++) {
            descArr[i] = arr[i];
        }
        Arrays.sort(descArr, Collections.reverseOrder());
        if (Arrays.equals(arr, ascArr)) bw.write("ascending");
        else if (Arrays.equals(arr, descArr)) bw.write("descending");
        else bw.write("mixed");
        bw.flush();
        bw.close();
        br.close();
    }
}