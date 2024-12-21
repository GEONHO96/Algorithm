import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int i = sc.nextInt();
        int songs = A * (i - 1) + 1;
        System.out.println(songs);
    }
}