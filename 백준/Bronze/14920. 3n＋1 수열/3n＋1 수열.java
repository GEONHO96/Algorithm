import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int C = sc.nextInt();
        int n = 0;
        while (C > 1) {
            if (C % 2 == 0) {
                C /= 2;
                n++;
            } else {
                C = 3 * C + 1;
                n++;
            }
        }
        System.out.println(n + 1);
    }
}