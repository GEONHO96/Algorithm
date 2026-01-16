import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

class Student implements Comparable<Student> {
    String name;
    int day;
    int month;
    int year;
    Student(String name, int day, int month, int year) {
        this.name = name;
        this.day = day;
        this.month = month;
        this.year = year;
    }
    @Override
    public int compareTo(Student student) {
        if (this.year == student.year) {
            if (this.month == student.month) {
                return this.day - student.day;
            }
            return this.month - student.month;
        }
        return this.year - student.year;
    }
}
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        Student[] student = new Student[n];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            int day = Integer.parseInt(st.nextToken());
            int month = Integer.parseInt(st.nextToken());
            int year = Integer.parseInt(st.nextToken());
            student[i] = new Student(name, day, month, year);
        }
        Arrays.sort(student);
        bw.write(student[n - 1].name + "\n" + student[0].name);
        bw.flush();
        bw.close();
        br.close();
    }
}