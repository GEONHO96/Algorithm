import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        int min = 2000;
        min = Math.min(min, A + D);
        min = Math.min(min, B + C);
        System.out.println(min);
    }
}