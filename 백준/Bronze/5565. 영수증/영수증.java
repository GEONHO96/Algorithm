import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = sc.nextInt();
        int partSum = 0;
        for (int i = 1; i <= 9; i++) {
            int price = sc.nextInt();
            partSum += price;
        }
        System.out.println(sum - partSum);
    }
}