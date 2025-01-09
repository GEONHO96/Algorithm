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

            /**
             * 스택이 가장 윗 부분이 구하고자 하는 수와 같은지 체크
             */
            if (!stack.isEmpty() && stack.peek() == target) {
                stack.pop();
                sb.append("-\n");
            } else {
                // 수열이 불가능함
                isPossible = false;
                break;
            }
        }

        if (isPossible) {
            System.out.print(sb.toString());
        } else {
            System.out.println("NO");
        }

        sc.close();
    }
}