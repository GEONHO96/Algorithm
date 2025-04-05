import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] S = sc.next().split("/");
        int K = Integer.parseInt(S[0]);
        int D = Integer.parseInt(S[1]);
        int A = Integer.parseInt(S[2]);
        if (K + A < D || D == 0) System.out.print("hasu");
        else System.out.print("gosu");
    }
}