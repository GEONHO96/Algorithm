import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        int P = sc.nextInt();
        int limitPeople = L * P;
        int difference;
        for (int i = 0; i < 5; i++) {
            int participants = sc.nextInt();
            difference = participants - limitPeople;
            System.out.print(difference + " ");
        }
    }
}