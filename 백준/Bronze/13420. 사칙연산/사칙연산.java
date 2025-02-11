import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < T; i++) {
            String input = sc.nextLine();
            String[] parts = input.split(" ");

            long A = Long.parseLong(parts[0]);
            String operation = parts[1];
            long B = Long.parseLong(parts[2]);
            long expectedResult = Long.parseLong(parts[4]);

            long actualResult = 0;

            switch (operation) {
                case "+":
                    actualResult = A + B;
                    break;
                case "-":
                    actualResult = A - B;
                    break;
                case "*":
                    actualResult = A * B;
                    break;
                case "/":
                    actualResult = A / B;
                    break;
            }

            System.out.println(actualResult == expectedResult ? "correct" : "wrong answer");
        }

        sc.close();
    }
}