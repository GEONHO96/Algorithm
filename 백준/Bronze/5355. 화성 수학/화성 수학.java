import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < T; i++) {
            String[] input = sc.nextLine().split(" ");
            double A = Double.parseDouble(input[0]);
            for (int j = 1; j < input.length; j++) {
                char operator = input[j].charAt(0);
                if (operator == '@') A *= 3;
                else if (operator == '%') A += 5;
                else if (operator == '#') A -= 7;
            }
            System.out.printf("%.2f\n", A);
        }
        sc.close();
    }
}