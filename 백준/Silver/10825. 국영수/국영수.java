import java.util.Scanner;
import java.util.Arrays;

class Student implements Comparable<Student> {
    String name;
    int kor;
    int eng;
    int math;
    public Student(String name, int kor, int eng, int math) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }
    @Override
    public int compareTo(Student student) {
        if (this.kor == student.kor) {
            if (this.eng == student.eng) {
                if (this.math == student.math) {
                    return this.name.compareTo(student.name);
                }
                return student.math - this.math;
            }
            return this.eng - student.eng;
        }
        return student.kor - this.kor;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Student[] student = new Student[N];
        for (int i = 0; i < N; i++) {
            String name = sc.next();
            int kor = sc.nextInt();
            int eng = sc.nextInt();
            int math = sc.nextInt();
            student[i] = new Student(name, kor, eng, math);
        }
        Arrays.sort(student);
        for (int i = 0; i < N; i++)
            System.out.println(student[i].name);
    }
}