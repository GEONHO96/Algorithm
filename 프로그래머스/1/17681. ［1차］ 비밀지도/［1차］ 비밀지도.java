class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] arr3 = new String[n];
        for (int i = 0; i < n; i++) {
            arr3[i] = Integer.toBinaryString(arr1[i] | arr2[i]);
        }
        String[] ans = new String[n];
        for (int i = 0; i < n; i++) {
            ans[i] = "";
            String binary = String.format("%" + n + "s", arr3[i]).replace(' ', '0');
            for (int j = 0; j < n; j++) {
                if (binary.charAt(j) == '1') ans[i] += '#';
                else ans[i] += ' ';
            }
        }
        return ans;
    }
}