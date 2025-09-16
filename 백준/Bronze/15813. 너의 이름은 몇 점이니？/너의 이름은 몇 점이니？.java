import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        String name = br.readLine();
        int length = name.length();
        int sum = 0;
        for (int i = 0; i < length; i++) {
            if (name.charAt(i) == 'A') sum += 1;
            if (name.charAt(i) == 'B') sum += 2;
            if (name.charAt(i) == 'C') sum += 3;
            if (name.charAt(i) == 'D') sum += 4;
            if (name.charAt(i) == 'E') sum += 5;
            if (name.charAt(i) == 'F') sum += 6;
            if (name.charAt(i) == 'G') sum += 7;
            if (name.charAt(i) == 'H') sum += 8;
            if (name.charAt(i) == 'I') sum += 9;
            if (name.charAt(i) == 'J') sum += 10;
            if (name.charAt(i) == 'K') sum += 11;
            if (name.charAt(i) == 'L') sum += 12;
            if (name.charAt(i) == 'M') sum += 13;
            if (name.charAt(i) == 'N') sum += 14;
            if (name.charAt(i) == 'O') sum += 15;
            if (name.charAt(i) == 'P') sum += 16;
            if (name.charAt(i) == 'Q') sum += 17;
            if (name.charAt(i) == 'R') sum += 18;
            if (name.charAt(i) == 'S') sum += 19;
            if (name.charAt(i) == 'T') sum += 20;
            if (name.charAt(i) == 'U') sum += 21;
            if (name.charAt(i) == 'V') sum += 22;
            if (name.charAt(i) == 'W') sum += 23;
            if (name.charAt(i) == 'X') sum += 24;
            if (name.charAt(i) == 'Y') sum += 25;
            if (name.charAt(i) == 'Z') sum += 26;
        }
        bw.write(String.valueOf(sum));
        bw.flush();
        bw.close();
        br.close();
    }
}