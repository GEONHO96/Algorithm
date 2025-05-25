import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while (true) {
            String input = br.readLine();
            if (input.equals("end")) break;
            boolean isAcceptable = true;
            boolean hasVowel = false;
            int vowelCount = 0;
            int consonantCount = 0;
            char prevChar = ' ';
            for (int i = 0; i < input.length(); i++) {
                char ch = input.charAt(i);
                boolean isVowel = "aeiou".indexOf(ch) >= 0;
                if (isVowel) {
                    hasVowel = true;
                    vowelCount++;
                    consonantCount = 0;
                } else {
                    consonantCount++;
                    vowelCount = 0;
                }
                if (vowelCount == 3 || consonantCount == 3) {
                    isAcceptable = false;
                    break;
                }
                if (i > 0 && ch == prevChar && !(ch == 'e' || ch == 'o')) {
                    isAcceptable = false;
                    break;
                }
                prevChar = ch;
            }
            if (isAcceptable && hasVowel) {
                bw.write("<" + input + "> is acceptable.\n");
            } else {
                bw.write("<" + input + "> is not acceptable.\n");
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}