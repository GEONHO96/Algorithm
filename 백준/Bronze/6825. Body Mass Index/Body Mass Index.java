import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        double weight = Double.parseDouble(br.readLine());
        double height = Double.parseDouble(br.readLine());
        double BMI = weight / (height * height);
        if (BMI > 25) bw.write("Overweight");
        else if (18.5 <= BMI && BMI <= 25.0) bw.write("Normal weight");
        else bw.write("Underweight");
        bw.flush();
        bw.close();
        br.close();
    }
}