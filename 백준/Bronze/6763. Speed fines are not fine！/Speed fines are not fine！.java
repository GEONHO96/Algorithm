import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        if (b - a < 1) bw.write("Congratulations, you are within the speed limit!");
        if (b - a >= 1 && b - a <= 20) bw.write("You are speeding and your fine is $100.");
        if (b - a >= 21 && b - a <= 30) bw.write("You are speeding and your fine is $270.");
        if (b - a >= 31) bw.write("You are speeding and your fine is $500.");
        bw.flush();
        bw.close();
        br.close();
    }
}