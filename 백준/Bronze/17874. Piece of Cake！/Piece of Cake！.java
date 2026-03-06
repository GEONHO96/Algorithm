import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        int h = sc.nextInt();
        int v = sc.nextInt();
        int res = Math.max(h, n - h) * Math.max(v, n - v);
        System.out.print(4 * res);
    }
}