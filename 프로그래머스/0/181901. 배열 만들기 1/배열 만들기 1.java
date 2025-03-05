class Solution {
    public int[] solution(int n, int k) {
        int[] answer = new int[n / k];
        int len = answer.length;
        for (int i = 0; i < len; i++) {
            answer[i] = (i + 1) * k;
        }
        return answer;
    }
}