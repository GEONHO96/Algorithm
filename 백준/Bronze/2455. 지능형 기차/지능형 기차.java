import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 0;
        int sum = 0;
        for (int i = 0; i < 4; i++) {
            int end = sc.nextInt();
            int start = sc.nextInt();
            sum += start - end;
            max = Math.max(max, sum);
        }
        System.out.println(max);
    }
}