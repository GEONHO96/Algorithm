import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num1 = Integer.parseInt(br.readLine());
        int num2 = Integer.parseInt(br.readLine());
        int num3 = Integer.parseInt(br.readLine());
        int max = Math.max(Math.max(num1, num2), num3);
        int min = Math.min(Math.min(num1, num2), num3);
        if (num1 != max && num1 != min) bw.write(String.valueOf(num1));
        if (num2 != max && num2 != min) bw.write(String.valueOf(num2));
        if (num3 != max && num3 != min) bw.write(String.valueOf(num3));
        bw.flush();
        bw.close();
        br.close();
    }
}