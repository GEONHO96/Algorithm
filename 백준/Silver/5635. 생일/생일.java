import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    static class Person {
        String name;
        int day;
        int month;
        int year;
        Person (String name, int day, int month, int year) {
            this.name = name;
            this.day = day;
            this.month = month;
            this.year = year;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        Person[] person = new Person[n];
        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");
            String name = input[0];
            int day = Integer.parseInt(input[1]);
            int month = Integer.parseInt(input[2]);
            int year = Integer.parseInt(input[3]);
            person[i] = new Person(name, day, month, year);
        }
        Arrays.sort(person, new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                if (p1.year != p2.year) return p1.year - p2.year;
                if (p1.month != p2.month) return p1.month - p2.month;
                return p1.day - p2.day;
            }
        });
        bw.write(person[n - 1].name + "\n");
        bw.write(person[0].name + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}