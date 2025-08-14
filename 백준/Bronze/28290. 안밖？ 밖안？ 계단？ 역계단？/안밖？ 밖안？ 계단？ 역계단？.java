import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String S = br.readLine();
        if (S.equals("fdsajkl;") || S.equals("jkl;fdsa")) {
            bw.write("in-out");
        } else if (S.equals("asdf;lkj") || S.equals(";lkjasdf")) {
            bw.write("out-in");
        } else if (S.equals("asdfjkl;")) {
            bw.write("stairs");
        } else if (S.equals(";lkjfdsa")) {
            bw.write("reverse");
        } else {
            bw.write("molu");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}