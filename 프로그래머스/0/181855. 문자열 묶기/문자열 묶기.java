import java.util.Map;
import java.util.HashMap;

class Solution {
    public int solution(String[] strArr) {
        Map<Integer, Integer> lengthCount = new HashMap<>();
        for (String str : strArr) {
            int len = str.length();
            lengthCount.put(len, lengthCount.getOrDefault(len, 0) + 1);
        }
        int maxCount = 0;
        for (int count : lengthCount.values()) {
            if (count > maxCount) {
                maxCount = count;
            }
        }
        return maxCount;
    }
}