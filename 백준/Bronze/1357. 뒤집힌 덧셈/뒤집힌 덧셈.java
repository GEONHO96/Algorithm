import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int Rev_X = 0;
        int Rev_Y = 0;
        while (X > 0) {
            Rev_X = X % 10 + Rev_X * 10;
            X /= 10;
        }
        while (Y > 0) {
            Rev_Y = Y % 10 + Rev_Y * 10;
            Y /= 10;
        }
        int Z = Rev_X + Rev_Y;
        int Rev_Z = 0;
        while (Z > 0) {
            Rev_Z = Z % 10 + Rev_Z * 10;
            Z /= 10;
        }
        System.out.println(Rev_Z);
    }
}