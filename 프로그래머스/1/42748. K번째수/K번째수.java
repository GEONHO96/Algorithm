import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int len = commands.length;
        int[] answer = new int[len];
        for (int i = 0; i < len; i++) {
            int start = commands[i][0] - 1;
            int end = commands[i][1];
            int k = commands[i][2] - 1;
            int[] sliced = Arrays.copyOfRange(array, start, end);
            Arrays.sort(sliced);
            answer[i] = sliced[k];
        }
        return answer;
    }
}