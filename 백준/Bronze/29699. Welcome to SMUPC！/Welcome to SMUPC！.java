import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String labelSheet = "WelcomeToSMUPC";
        System.out.println(labelSheet.charAt((N - 1) % 14));
    }
}