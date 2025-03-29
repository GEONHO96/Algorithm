class Solution {
    public int[] solution(int[] arr) {
        int len1 = arr.length;
        int len2 = 0;
        for (int i = 0; i < len1; i++) {
            len2 += arr[i];
        }
        int[] ans = new int[len2];
        int idx = 0;
        for (int i = 0; i < len1; i++) {
            for (int j = 0; j < arr[i]; j++) {
                ans[idx++] = arr[i];
            }
        }
        return ans;
    }
}