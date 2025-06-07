import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        String regex = "^[A-F]?A+F+C+[A-F]?$";
        Pattern pattern = Pattern.compile(regex);
        while (T-- > 0) {
            String line = br.readLine();
            if (pattern.matcher(line).matches()) {
                bw.write("Infected!\n");
            } else {
                bw.write("Good\n");
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}