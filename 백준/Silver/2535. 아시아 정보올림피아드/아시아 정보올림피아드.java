import java.util.Scanner;
import java.util.Arrays;

class Participant implements Comparable<Participant> {
    int nation;
    int studentNumber;
    int score;
    public Participant(int nation, int studentNumber, int score) {
        this.nation = nation;
        this.studentNumber = studentNumber;
        this.score = score;
    }
    @Override
    public int compareTo(Participant participant) {
        return participant.score - this.score;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Participant[] participant = new Participant[N];
        for (int i = 0; i < N; i++) {
            int nation = sc.nextInt();
            int studentNumber = sc.nextInt();
            int score = sc.nextInt();
            participant[i] = new Participant(nation, studentNumber, score);
        }
        Arrays.sort(participant);
        int rank = 0;
        for (int i = 0; i < N; i++) {
            int cnt = 0;
            for (int j = i - 1; j >= 0; j--) {
                if (participant[i].nation == participant[j].nation) cnt++;
            }
            if (cnt >= 2) continue;
            else System.out.println(participant[i].nation + " " + participant[i].studentNumber);
            rank++;
            if (rank == 3) break;
        }
    }
}