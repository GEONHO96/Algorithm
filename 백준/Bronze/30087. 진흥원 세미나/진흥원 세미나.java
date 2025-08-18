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
        for (int i = 0; i < N; i++) {
            String subject = br.readLine();
            if (subject.equals("Algorithm")) bw.write("204\n");
            if (subject.equals("DataAnalysis")) bw.write("207\n");
            if (subject.equals("ArtificialIntelligence")) bw.write("302\n");
            if (subject.equals("CyberSecurity")) bw.write("B101\n");
            if (subject.equals("Network")) bw.write("303\n");
            if (subject.equals("Startup")) bw.write("501\n");
            if (subject.equals("TestStrategy")) bw.write("105\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}