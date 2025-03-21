class Solution {
    public String solution(String cipher, int code) {
        StringBuilder sb = new StringBuilder();
        int len = cipher.length();
        for (int i = 0; i < len; i++) {
            if ((i + 1) % code == 0) {
                sb.append(cipher.charAt(i));
            }
        }
        return sb.toString();
    }
}