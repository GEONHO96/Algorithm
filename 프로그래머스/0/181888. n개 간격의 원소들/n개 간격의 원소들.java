class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = {};
        int len = num_list.length;
        if (len % n == 0) {
            answer = new int[len / n];
            for (int i = 0; i < len / n; i++) {
                answer[i] = num_list[n * i];
            }
        } else {
            answer = new int[len / n + 1];
            for (int i = 0; i < len / n + 1; i++) {
                answer[i] = num_list[n * i];
            }
        }
        return answer;
    }
}