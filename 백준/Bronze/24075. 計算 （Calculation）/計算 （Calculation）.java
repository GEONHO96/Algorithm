import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = A + B;
        int D = A - B;
        if (C > D) {
            System.out.println(C);
            System.out.println(D);
        } else {
            System.out.println(D);
            System.out.println(C);
        }
    }
}