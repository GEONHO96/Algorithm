import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String mbti = br.readLine();
        int length = mbti.length();
        String newMbti = "";
        for (int i = 0; i < length; i++) {
            if (mbti.charAt(i) == 'E') newMbti += "I";
            if (mbti.charAt(i) == 'I') newMbti += "E";
            if (mbti.charAt(i) == 'S') newMbti += "N";
            if (mbti.charAt(i) == 'N') newMbti += "S";
            if (mbti.charAt(i) == 'T') newMbti += "F";
            if (mbti.charAt(i) == 'F') newMbti += "T";
            if (mbti.charAt(i) == 'J') newMbti += "P";
            if (mbti.charAt(i) == 'P') newMbti += "J";
        }
        bw.write(newMbti);
        bw.flush();
        bw.close();
        br.close();
    }
}