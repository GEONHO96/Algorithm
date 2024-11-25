import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) >= 'A' && S.charAt(i) <= 'Z') {
                System.out.print(S.charAt(i));
            }
        }
    }
}