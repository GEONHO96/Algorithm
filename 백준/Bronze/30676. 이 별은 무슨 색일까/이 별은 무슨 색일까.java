import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int ramda = Integer.parseInt(br.readLine());
        if (ramda >= 620 && ramda <= 780) bw.write("Red");
        if (ramda >= 590 && ramda < 620) bw.write("Orange");
        if (ramda >= 570 && ramda < 590) bw.write("Yellow");
        if (ramda >= 495 && ramda < 570) bw.write("Green");
        if (ramda >= 450 && ramda < 495) bw.write("Blue");
        if (ramda >= 425 && ramda < 450) bw.write("Indigo");
        if (ramda >= 380 && ramda < 425) bw.write("Violet");
        bw.flush();
        bw.close();
        br.close();
    }
}