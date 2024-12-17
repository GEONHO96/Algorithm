import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            String S = sc.next();
            int length = S.length();
            int score = 0;
            int sum = 0;
            for (int j = 0; j < length; j++) {
                if (j == 0) {
                    if (S.charAt(j) == 'X') score = 0;
                    if (S.charAt(j) == 'O') score = 1;
                } else {
                    if (S.charAt(j - 1) == 'X' && S.charAt(j) == 'X') score = 0;
                    if (S.charAt(j - 1) == 'X' && S.charAt(j) == 'O') score = 1;
                    if (S.charAt(j - 1) == 'O' && S.charAt(j) == 'X') score = 0;
                    if (S.charAt(j - 1) == 'O' && S.charAt(j) == 'O') score = score + 1;
                }
                sum += score;
            }
            System.out.println(sum);
        }
    }
}