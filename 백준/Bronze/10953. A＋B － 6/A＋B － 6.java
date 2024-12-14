import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            String S = sc.next();
            int A = Integer.parseInt(String.valueOf(S.charAt(0)));
            int B = Integer.parseInt(String.valueOf(S.charAt(S.length() - 1)));
            System.out.println(A + B);
        }
    }
}