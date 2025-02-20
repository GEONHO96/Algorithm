class Solution {
    public int[] solution(int[] num_list) {
        int n = num_list.length;
        int a = 0;
        if (num_list[n - 1] > num_list[n - 2]) a = num_list[n - 1] - num_list[n - 2];
        else a = 2 * num_list[n - 1];
        int[] answer = new int[n + 1];
        for (int i = 0; i < n + 1; i++) {
            if (i == n) answer[i] = a;
            else answer[i] = num_list[i];
        }
        return answer;
    }
}