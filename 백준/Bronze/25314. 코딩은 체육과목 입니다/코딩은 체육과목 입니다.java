import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        StringBuilder S = new StringBuilder();
        if (N == 4) {
            S.append("long int");
        }
        if (N > 4 && N % 4 == 0) {
            for (int i = 0; i < N / 4 - 1; i++) {
                S.append("long ");
            }
            S.append("long int ");
        }
        System.out.println(S);
    }
}