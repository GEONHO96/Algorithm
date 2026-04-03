import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int Ca = Integer.parseInt(st.nextToken());
        int Ba = Integer.parseInt(st.nextToken());
        int Pa = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int Cr = Integer.parseInt(st.nextToken());
        int Br = Integer.parseInt(st.nextToken());
        int Pr = Integer.parseInt(st.nextToken());
        int passengers = 0;
        if (Ca <= Cr) passengers += Cr - Ca;
        if (Ba <= Br) passengers += Br - Ba;
        if (Pa <= Pr) passengers += Pr - Pa;
        bw.write(String.valueOf(passengers));
        bw.flush();
        bw.close();
        br.close();
    }
}