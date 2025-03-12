class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        int len1 = intervals[0][1] - intervals[0][0] + 1;
        int len2 = intervals[1][1] - intervals[1][0] + 1;
        int len = len1 + len2;
        int[] answer = new int[len];
        for (int i = 0; i < len; i++) {
            if (0 <= i && i < len1) {
                answer[i] = arr[intervals[0][0] + i]; 
            } else {
                answer[i] = arr[intervals[1][0] + i - len1];
            }
        }
        return answer;
    }
}