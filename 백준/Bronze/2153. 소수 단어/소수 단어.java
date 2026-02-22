import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String word = br.readLine();
        int length = word.length();
        int sum = 0;
        boolean satisfied = true;
        for (int i = 0; i < length; i++) {
            if (word.charAt(i) == 'a') sum += 1;
            else if (word.charAt(i) == 'b') sum += 2;
            else if (word.charAt(i) == 'c') sum += 3;
            else if (word.charAt(i) == 'd') sum += 4;
            else if (word.charAt(i) == 'e') sum += 5;
            else if (word.charAt(i) == 'f') sum += 6;
            else if (word.charAt(i) == 'g') sum += 7;
            else if (word.charAt(i) == 'h') sum += 8;
            else if (word.charAt(i) == 'i') sum += 9;
            else if (word.charAt(i) == 'j') sum += 10;
            else if (word.charAt(i) == 'k') sum += 11;
            else if (word.charAt(i) == 'l') sum += 12;
            else if (word.charAt(i) == 'm') sum += 13;
            else if (word.charAt(i) == 'n') sum += 14;
            else if (word.charAt(i) == 'o') sum += 15;
            else if (word.charAt(i) == 'p') sum += 16;
            else if (word.charAt(i) == 'q') sum += 17;
            else if (word.charAt(i) == 'r') sum += 18;
            else if (word.charAt(i) == 's') sum += 19;
            else if (word.charAt(i) == 't') sum += 20;
            else if (word.charAt(i) == 'u') sum += 21;
            else if (word.charAt(i) == 'v') sum += 22;
            else if (word.charAt(i) == 'w') sum += 23;
            else if (word.charAt(i) == 'x') sum += 24;
            else if (word.charAt(i) == 'y') sum += 25;
            else if (word.charAt(i) == 'z') sum += 26;
            else if (word.charAt(i) == 'A') sum += 27;
            else if (word.charAt(i) == 'B') sum += 28;
            else if (word.charAt(i) == 'C') sum += 29;
            else if (word.charAt(i) == 'D') sum += 30;
            else if (word.charAt(i) == 'E') sum += 31;
            else if (word.charAt(i) == 'F') sum += 32;
            else if (word.charAt(i) == 'G') sum += 33;
            else if (word.charAt(i) == 'H') sum += 34;
            else if (word.charAt(i) == 'I') sum += 35;
            else if (word.charAt(i) == 'J') sum += 36;
            else if (word.charAt(i) == 'K') sum += 37;
            else if (word.charAt(i) == 'L') sum += 38;
            else if (word.charAt(i) == 'M') sum += 39;
            else if (word.charAt(i) == 'N') sum += 40;
            else if (word.charAt(i) == 'O') sum += 41;
            else if (word.charAt(i) == 'P') sum += 42;
            else if (word.charAt(i) == 'Q') sum += 43;
            else if (word.charAt(i) == 'R') sum += 44;
            else if (word.charAt(i) == 'S') sum += 45;
            else if (word.charAt(i) == 'T') sum += 46;
            else if (word.charAt(i) == 'U') sum += 47;
            else if (word.charAt(i) == 'V') sum += 48;
            else if (word.charAt(i) == 'W') sum += 49;
            else if (word.charAt(i) == 'X') sum += 50;
            else if (word.charAt(i) == 'Y') sum += 51;
            else if (word.charAt(i) == 'Z') sum += 52;
        }
        for (int i = 2; i < sum; i++) {
            if (sum % i == 0) {
                satisfied = false;
                break;
            }
        }
        bw.write(satisfied ? "It is a prime word." : "It is not a prime word.");
        bw.flush();
        bw.close();
        br.close();
    }
}