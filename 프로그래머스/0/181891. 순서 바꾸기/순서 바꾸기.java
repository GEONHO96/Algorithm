class Solution {
    public int[] solution(int[] num_list, int n) {
        int m = num_list.length;
        int[] ans = new int[m];
        for (int i = 0; i < m; i++) {
            if (0 <= i && i < m - n) {
                ans[i] = num_list[n + i];
            } else {
                ans[i] = num_list[n + i - m];
            }                        
        }
        return ans;
    }
}