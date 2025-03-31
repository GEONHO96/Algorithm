import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();
        int len = str.length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < len; i++) {
            if ('a' <= str.charAt(i) && str.charAt(i) <= 'z') sb.append(Character.toUpperCase(str.charAt(i)));
            else sb.append(str.charAt(i));
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}