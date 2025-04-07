import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String operation = sc.next();
        String[] parts = operation.split(",");
        int sum = 0;
        for (int i = 0; i < parts.length; i++) {
            sum += Integer.parseInt(parts[i]);
        }
        System.out.println(sum);
    }
}