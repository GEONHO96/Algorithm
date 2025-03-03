class Solution {
    public String solution(String my_string, int[] indices) {
        boolean[] remove = new boolean[my_string.length()];
        for (int index : indices) {
            if (index >= 0 && index < my_string.length()) {
                remove[index] = true;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < my_string.length(); i++) {
            if (!remove[i]) {
                sb.append(my_string.charAt(i));
            }
        }
        return sb.toString();
    }
}