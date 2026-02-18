import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if (x <= 12) System.out.print(x);
        else System.out.print(x + 1);
    }
}