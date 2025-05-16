class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        int n = my_strings.length;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = parts[i][0]; j <= parts[i][1]; j++) {
                sb.append(my_strings[i].charAt(j));
            }
        }
        return sb.toString();
    }
}