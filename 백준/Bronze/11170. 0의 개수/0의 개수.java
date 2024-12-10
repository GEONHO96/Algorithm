import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            int cnt = 0;
            StringBuilder S = new StringBuilder();
            for (int j = N; j <= M; j++) {
                S.append(j);
            }
            for (int j = 0; j < S.length(); j++) {
                if (S.charAt(j) == '0') cnt++;
            }
            System.out.println(cnt);
        }
    }
}