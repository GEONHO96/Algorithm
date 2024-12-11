import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        for (int i = 0; i < L; i++) {
            int N = sc.nextInt();
            char x = sc.next().charAt(0);
            for (int j = 0; j < N; j++) {
                System.out.print(x);
            }
            System.out.println();
        }
    }
}