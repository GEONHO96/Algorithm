import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int c = sc.nextInt();
            int v = sc.nextInt();
            System.out.println("You get " + (c / v) + " piece(s) and your dad gets " + (c % v) + " piece(s).");
        }
    }
}