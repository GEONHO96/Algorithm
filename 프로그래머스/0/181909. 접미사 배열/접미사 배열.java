import java.util.Arrays;

class Solution {
    public String[] solution(String my_string) {
        int n = my_string.length();
        String[] a = new String[n];
        for (int i = 0; i < n; i++) {
            a[i] = my_string.substring(i);
        }
        Arrays.sort(a);
        return a;
    }
}