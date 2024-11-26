import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String grade = sc.next();
        if (grade.equals("A+")) System.out.println(4.3);
        if (grade.equals("A0")) System.out.println(4.0);
        if (grade.equals("A-")) System.out.println(3.7);
        if (grade.equals("B+")) System.out.println(3.3);
        if (grade.equals("B0")) System.out.println(3.0);
        if (grade.equals("B-")) System.out.println(2.7);
        if (grade.equals("C+")) System.out.println(2.3);
        if (grade.equals("C0")) System.out.println(2.0);
        if (grade.equals("C-")) System.out.println(1.7);
        if (grade.equals("D+")) System.out.println(1.3);
        if (grade.equals("D0")) System.out.println(1.0);
        if (grade.equals("D-")) System.out.println(0.7);
        if (grade.equals("F")) System.out.println(0.0);
    }
}