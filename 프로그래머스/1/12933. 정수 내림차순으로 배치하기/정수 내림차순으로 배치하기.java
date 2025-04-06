import java.util.Arrays;

class Solution {
    public long solution(long n) {
        String S = String.valueOf(n);
        int len = S.length();
        long[] arr1 = new long[len];
        for (int i = 0; i < len; i++) {
            arr1[i] = Integer.parseInt(String.valueOf(S.charAt(i)));
        }
        Arrays.sort(arr1);
        long[] arr2 = new long[len];
        for (int i = 0; i < len; i++) {
            arr2[i] = arr1[len - 1 - i];
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < len; i++) {
            sb.append(arr2[i]);
        }
        long answer = Long.parseLong(sb.toString());
        return answer;
    }
}