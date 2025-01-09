import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] sequence = new int[n];
        for (int i = 0; i < n; i++) {
            sequence[i] = sc.nextInt();
        }

        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        int now = 1;
        boolean isPossible = true;

        for (int i = 0; i < n; i++) {
            int target = sequence[i];
            while (now <= target) {
                stack.push(now);
                sb.append("+\n");
                now++;
            }
            if (!stack.isEmpty() && stack.peek() == target) {
                stack.pop();
                sb.append("-\n");
            } else {
                isPossible = false;
                break;
            }
        }

        if (isPossible) {
            System.out.print(sb.toString());
        } else {
            System.out.print("NO");
        }

        sc.close();
    }
}