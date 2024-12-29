import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int angleA = sc.nextInt();
        int angleB = sc.nextInt();
        int angleC = sc.nextInt();
        if (angleA == 60 && angleB == 60 && angleC == 60) System.out.println("Equilateral");
        else if (angleA + angleB + angleC == 180) {
            if (angleA == angleB || angleB == angleC || angleC == angleA) System.out.println("Isosceles");
            if (angleA != angleB && angleB != angleC && angleC != angleA) System.out.println("Scalene");
        }
        else if (angleA + angleB + angleC != 180) System.out.println("Error");
    }
}