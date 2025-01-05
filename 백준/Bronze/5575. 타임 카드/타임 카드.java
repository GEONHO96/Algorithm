import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            int startHour = sc.nextInt();
            int startMinute = sc.nextInt();
            int startSecond = sc.nextInt();
            int finishHour = sc.nextInt();
            int finishMinute = sc.nextInt();
            int finishSecond = sc.nextInt();
            int period = (finishHour * 3600  + finishMinute * 60 + finishSecond) - (startHour * 3600 + startMinute * 60 + startSecond);
            int h = period / 3600;
            period %= 3600;
            int m = period / 60;
            period %= 60;
            int s = period;
            System.out.println(h + " " + m + " " + s);
        }
    }
}