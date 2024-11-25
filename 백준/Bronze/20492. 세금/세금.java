import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int price1 = (N * 78) / 100;
        int price2 = (N * 80) / 100 + (((N * 20) / 100) * 78) / 100;
        System.out.print(price1 + " " + price2);
    }
}