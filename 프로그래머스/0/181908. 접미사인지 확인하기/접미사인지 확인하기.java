class Solution {
    public int solution(String my_string, String is_suffix) {
        int result = 0;
        int n = my_string.length();
        String[] a = new String[n];
        for (int i = 0; i < n; i++) {
            a[i] = my_string.substring(i);
        }
        for (int i = 0; i < n; i++) {
            if (a[i].equals(is_suffix)) {
                result = 1;
                break;
            }
        }
        return result;
    }
}