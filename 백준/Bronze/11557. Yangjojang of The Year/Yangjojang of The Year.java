import java.util.Scanner;
import java.util.Arrays;

class MT implements Comparable<MT> {
    String S;
    int L;
    MT(String S, int L) {
        this.S = S;
        this.L = L;
    }
    @Override
    public int compareTo(MT mt) {
        return this.L - mt.L;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();
            MT[] mt = new MT[N];
            for (int j = 0; j < N; j++) {
                String S = sc.next();
                int L = sc.nextInt();
                mt[j] = new MT(S, L);
            }
            Arrays.sort(mt);
            System.out.println(mt[N - 1].S);
        }
    }
}