import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < T; i++) {
            String S = sc.nextLine();
            String[] numbers = S.split(" ");
            int sum = 0;
            for (String num : numbers) {
                sum += Integer.parseInt(num);
            }
            System.out.println(sum);
        }
        sc.close();
    }
}