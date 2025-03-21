import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(String my_string) {
        int len = my_string.length();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            if ('0' <= my_string.charAt(i) && my_string.charAt(i) <= '9') {
                list.add(Integer.parseInt(String.valueOf(my_string.charAt(i))));
            }
        }
        int[] arr = list.stream().mapToInt(Integer::intValue).toArray();
        Arrays.sort(arr);
        return arr;
    }
}