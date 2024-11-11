import java.util.Scanner;
import java.util.Arrays;

class Student implements Comparable<Student> {
    String name;
    int day;
    int month;
    int year;
    public Student(String name, int day, int month, int year) {
        this.name = name;
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public int compareTo(Student students) {
        if (this.year == students.year) {
            if (this.month == students.month) {
                return this.day - students.day;
            }
            return this.month - students.month;
        }
        return this.year - students.year;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student[] students = new Student[n];
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int day = sc.nextInt();
            int month = sc.nextInt();
            int year = sc.nextInt();
            students[i] = new Student(name, day, month, year);
        }

        Arrays.sort(students);
        System.out.println(students[n - 1].name);
        System.out.println(students[0].name);
    }
}