import java.util.Scanner;
import java.util.Arrays;

class User implements Comparable<User> {
    int age;
    String name;
    public User(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public int compareTo(User user) {
        return this.age - user.age;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        User[] user = new User[N];
        for (int i = 0; i < N; i++) {
            int age = sc.nextInt();
            String name = sc.next();
            user[i] = new User(age, name);
        }

        Arrays.sort(user);

        for (int i = 0; i < N; i++)
            System.out.println(user[i].age + " " + user[i].name);
    }
}