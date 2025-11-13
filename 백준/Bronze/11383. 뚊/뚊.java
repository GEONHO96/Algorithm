import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < N; i++) {
            String[] word = br.readLine().split("");
            for (int j = 0; j < M; j++) {
                sb.append(word[j]);
                sb.append(word[j]);
            }
        }
        for (int i = 0; i < N; i++) {
            sb2.append(br.readLine());
        }
        String sb3 = sb.toString();
        String sb4 = sb2.toString();
        if (sb3.equals(sb4)) {
            System.out.println("Eyfa");
        } else System.out.println("Not Eyfa");
    }
}