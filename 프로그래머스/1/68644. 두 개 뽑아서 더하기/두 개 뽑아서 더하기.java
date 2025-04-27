import java.util.Set;
import java.util.TreeSet;

class Solution {
    public int[] solution(int[] numbers) {
        int n = numbers.length;
        Set<Integer> result = new TreeSet<>();
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                result.add(numbers[i] + numbers[j]);
            }
        }
        int[] ans = result.stream().mapToInt(Integer::intValue).toArray();
        return ans;
    }
}