import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        String strA = String.valueOf(A);
        String strB = String.valueOf(B);
        StringBuilder minSbA = new StringBuilder();
        StringBuilder minSbB = new StringBuilder();
        StringBuilder maxSbA = new StringBuilder();
        StringBuilder maxSbB = new StringBuilder();
        int lengthA = strA.length();
        int lengthB = strB.length();
        for (int i = 0; i < lengthA; i++) {
            if (strA.charAt(i) == '6') {
                minSbA.append('5');
                maxSbA.append(strA.charAt(i));
            } else if (strA.charAt(i) == '5') {
                minSbA.append(strA.charAt(i));
                maxSbA.append('6');
            } else {
                minSbA.append(strA.charAt(i));
                maxSbA.append(strA.charAt(i));
            }
        }
        for (int i = 0; i < lengthB; i++) {
            if (strB.charAt(i) == '6') {
                minSbB.append('5');
                maxSbB.append(strB.charAt(i));
            } else if (strB.charAt(i) == '5') {
                minSbB.append(strB.charAt(i));
                maxSbB.append('6');
            } else {
                minSbB.append(strB.charAt(i));
                maxSbB.append(strB.charAt(i));
            }
        }
        int minSum = Integer.parseInt(minSbA.toString()) + Integer.parseInt(minSbB.toString());
        int maxSum = Integer.parseInt(maxSbA.toString()) + Integer.parseInt(maxSbB.toString());
        bw.write(String.valueOf(minSum) + " " + String.valueOf(maxSum));
        bw.flush();
        bw.close();
        br.close();
    }
}