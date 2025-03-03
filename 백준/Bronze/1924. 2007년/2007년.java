import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int[] monthDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int totalDays = 0;
        for (int i = 0; i < x - 1; i++) {
            totalDays += monthDays[i];
        }
        totalDays += y - 1;
        String[] days = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
        System.out.println(days[totalDays % 7]);
    }
}