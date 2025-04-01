import java.util.Arrays;

class Solution {
    public int solution(int[] citations) {
        int count = 0;
        int len = citations.length;
        Arrays.sort(citations);
        for (int i = 0; i < len; i++) {
            int h = citations.length - i;
            if (citations[i] >= h) {
                count++;
            }
        }
        return count;
    }
}