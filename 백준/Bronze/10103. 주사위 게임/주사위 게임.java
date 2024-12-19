import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int changyeong = 100;
        int yeongdeok = 100;
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int dice1 = sc.nextInt();
            int dice2 = sc.nextInt();
            if (dice1 > dice2) yeongdeok -= dice1;
            else if (dice1 < dice2) changyeong -= dice2;
        }
        System.out.println(changyeong);
        System.out.println(yeongdeok);
    }
}