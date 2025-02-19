import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        String[] numbers = S.split(" ");
        int sum = 0;
        for (String num : numbers) {
            sum += Integer.parseInt(num);
        }
        System.out.println(sum);
        sc.close();
    }
}