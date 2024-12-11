import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            String password = sc.next();
            int length = password.length();
            if (6 <= length && length <= 9) System.out.println("yes");
            else System.out.println("no");
        }
    }
}