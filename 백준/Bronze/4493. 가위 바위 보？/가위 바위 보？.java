import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int player1 = 0;
            int player2 = 0;
            for (int i = 0; i < n; i++) {
                String[] player = br.readLine().split(" ");
                if (player[0].equals("R") && player[1].equals("R")) {
                    player1 += 0;
                    player2 += 0;
                }
                if (player[0].equals("R") && player[1].equals("S")) {
                    player1 += 1;
                    player2 += 0;
                }
                if (player[0].equals("R") && player[1].equals("P")) {
                    player1 += 0;
                    player2 += 1;
                }
                if (player[0].equals("S") && player[1].equals("R")) {
                    player1 += 0;
                    player2 += 1;
                }
                if (player[0].equals("S") && player[1].equals("S")) {
                    player1 += 0;
                    player2 += 0;
                }
                if (player[0].equals("S") && player[1].equals("P")) {
                    player1 += 1;
                    player2 += 0;
                }
                if (player[0].equals("P") && player[1].equals("R")) {
                    player1 += 1;
                    player2 += 0;
                }
                if (player[0].equals("P") && player[1].equals("S")) {
                    player1 += 0;
                    player2 += 1;
                }
                if (player[0].equals("P") && player[1].equals("P")) {
                    player1 += 0;
                    player2 += 0;
                }
            }
            if (player1 > player2) bw.write("Player 1" + "\n");
            if (player1 == player2) bw.write("TIE" + "\n");
            if (player1 < player2) bw.write("Player 2" + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}